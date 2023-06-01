package cn.lihongjie.json;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.*;

public class Json {

    public static Map<String, Object> toMap(String str) {

        CodePointCharStream input = CharStreams.fromString(str);
        JsonParser.JsonContext json = parseJson(input);
        ParseTreeWalker walker = new ParseTreeWalker();
        JsonToMapListener listener = new JsonToMapListener();
        walker.walk(listener, json);

        return (Map<String, Object>) listener.root;
    }

    public static List<Object> toList(String str) {

        CodePointCharStream input = CharStreams.fromString(str);
        JsonParser.JsonContext json = parseJson(input);
        ParseTreeWalker walker = new ParseTreeWalker();
        JsonToMapListener listener = new JsonToMapListener();
        walker.walk(listener, json);

        return (List<Object>) listener.root;
    }


    private static JsonParser.JsonContext parseJson(CodePointCharStream input) {
        JsonLexer lexer = new JsonLexer(input);

        JsonParser parser = new JsonParser(new BufferedTokenStream(lexer));


        JsonParser.JsonContext json = parser.json();
        return json;
    }

    private static class KVHolder {
        public String k;
        public Object v;

        public KVHolder(String k) {
            this.k = k;
        }
    }

    private static class JsonToMapListener extends JsonBaseListener {

        private Stack<Object> s = new Stack<Object>();

        private Object root;

        @Override
        public void enterObject(JsonParser.ObjectContext ctx) {

            s.push(new HashMap<>());


        }

        @Override
        public void exitObject(JsonParser.ObjectContext ctx) {
            commonExit();


        }

        private void commonExit() {
            Object pop = s.pop();
            if (s.isEmpty()) {
                this.root = pop;
            } else if (s.peek() instanceof KVHolder) {
                ((KVHolder) s.peek()).v = pop;
            } else if (s.peek() instanceof List) {
                ((List) s.peek()).add(pop);
            }
        }

        @Override
        public void enterKv(JsonParser.KvContext ctx) {
            s.push(new KVHolder(ctx.STRING().getText()));
        }

        @Override
        public void exitKv(JsonParser.KvContext ctx) {
            KVHolder pop = (KVHolder) s.pop();
            ((Map) s.peek()).put(unwrap(pop.k), pop.v);
        }

        public String unwrap(String src){

            if (src.startsWith("\"") && src.endsWith("\"")) {
                return src.substring(1, src.length() - 1);
            }else {
                return src;
            }
        }

        @Override
        public void enterArray(JsonParser.ArrayContext ctx) {
            s.push(new ArrayList<>());
        }

        @Override
        public void exitArray(JsonParser.ArrayContext ctx) {
            commonExit();

        }


        @Override
        public void exitStringValue(JsonParser.StringValueContext ctx) {
            Object value = unwrap(ctx.STRING().getText());
            setValue(value);
        }


        @Override
        public void exitNumberValue(JsonParser.NumberValueContext ctx) {
            String text = ctx.NUMBER().getText();
            Object value = text.contains(".") ? Double.parseDouble(text) : Integer.parseInt(text);
            setValue(value);
        }

        private void setValue(Object value) {
            Object peek = s.peek();
            if (peek instanceof KVHolder) {
                ((KVHolder) peek).v = value;
            } else if (peek instanceof List) {
                ((List) peek).add(value);
            }
        }




        @Override
        public void exitTrueValue(JsonParser.TrueValueContext ctx) {
            setValue(true);
        }


        @Override
        public void exitFalseValue(JsonParser.FalseValueContext ctx) {
            setValue(false);
        }


        @Override
        public void exitNullValue(JsonParser.NullValueContext ctx) {
            setValue(null);
        }
    }
}
