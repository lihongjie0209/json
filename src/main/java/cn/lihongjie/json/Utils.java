package cn.lihongjie.json;

public class Utils {
    public static String unwrap(String src){

        if (src.startsWith("\"") && src.endsWith("\"")) {
            return src.substring(1, src.length() - 1);
        }else {
            return src;
        }
    }

    public static Object parseNumber(String text) {
        Object value = text.contains(".") ? Double.parseDouble(text) : Integer.parseInt(text);
        return value;
    }
}
