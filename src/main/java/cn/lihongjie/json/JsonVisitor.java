// Generated from D:/code/json/src/main/resources\Json.g4 by ANTLR 4.12.0
package cn.lihongjie.json;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JsonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JsonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(JsonParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(JsonParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#kv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKv(JsonParser.KvContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(JsonParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(JsonParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValue(JsonParser.NumberValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectValue(JsonParser.ObjectValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(JsonParser.ArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueValue(JsonParser.TrueValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseValue(JsonParser.FalseValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullValue}
	 * labeled alternative in {@link JsonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValue(JsonParser.NullValueContext ctx);
}