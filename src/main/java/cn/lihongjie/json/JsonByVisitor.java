package cn.lihongjie.json;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JsonByVisitor {
    public static Map<String, Object> toMap(String str) {

        CodePointCharStream input = CharStreams.fromString(str);
        JsonParser.JsonContext json = parseJson(input);

        return (Map<String, Object>) json.accept(new JsonBaseVisitor());

    }

    public static List<Object> toList(String str) {

        CodePointCharStream input = CharStreams.fromString(str);
        JsonParser.JsonContext json = parseJson(input);

        JsonBaseVisitor visitor = new JsonBaseVisitor();
        return (List<Object>) json.accept(visitor);
    }


    private static JsonParser.JsonContext parseJson(CodePointCharStream input) {
        JsonLexer lexer = new JsonLexer(input);

        JsonParser parser = new JsonParser(new BufferedTokenStream(lexer));


        JsonParser.JsonContext json = parser.json();
        return json;
    }

    private static class JsonBaseVisitor extends cn.lihongjie.json.JsonBaseVisitor<Object> {

        @Override
        public Object visitJson(JsonParser.JsonContext ctx) {
            return ctx.array() != null ? visitArray(ctx.array()) : visitObject(ctx.object());
        }

        @Override
        public Object visitObject(JsonParser.ObjectContext ctx) {

            Map<String, Object> map = ctx.kv().stream().collect(Collectors.toMap((JsonParser.KvContext x) -> Utils.unwrap(x.STRING().getText()), (JsonParser.KvContext x) -> x.accept(this)));
            return map;
        }


        @Override
        public Object visitArray(JsonParser.ArrayContext ctx) {
            return ctx.value().stream().map(x -> x.accept(this)).collect(Collectors.toList());
        }

        @Override
        public Object visitStringValue(JsonParser.StringValueContext ctx) {
            return Utils.unwrap(ctx.STRING().getText());
        }

        @Override
        public Object visitNumberValue(JsonParser.NumberValueContext ctx) {
            return Utils.parseNumber(ctx.NUMBER().getText());
        }

        @Override
        public Object visitObjectValue(JsonParser.ObjectValueContext ctx) {
            return visitObject(ctx.object());
        }

        @Override
        public Object visitArrayValue(JsonParser.ArrayValueContext ctx) {

            return visitArray(ctx.array());
        }

        @Override
        public Object visitTrueValue(JsonParser.TrueValueContext ctx) {
            return true;
        }

        @Override
        public Object visitFalseValue(JsonParser.FalseValueContext ctx) {
            return false;
        }

        @Override
        public Object visitNullValue(JsonParser.NullValueContext ctx) {
            return null;
        }
    }
}
