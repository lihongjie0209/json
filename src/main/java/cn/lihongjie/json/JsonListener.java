// Generated from D:/code/json/src/main/resources\Json.g4 by ANTLR 4.12.0
package cn.lihongjie.json;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsonParser}.
 */
public interface JsonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JsonParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JsonParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(JsonParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(JsonParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#kv}.
	 * @param ctx the parse tree
	 */
	void enterKv(JsonParser.KvContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#kv}.
	 * @param ctx the parse tree
	 */
	void exitKv(JsonParser.KvContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JsonParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JsonParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(JsonParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(JsonParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(JsonParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(JsonParser.NumberValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(JsonParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(JsonParser.ObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(JsonParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(JsonParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterTrueValue(JsonParser.TrueValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitTrueValue(JsonParser.TrueValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterFalseValue(JsonParser.FalseValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitFalseValue(JsonParser.FalseValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNullValue(JsonParser.NullValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNullValue(JsonParser.NullValueContext ctx);
}