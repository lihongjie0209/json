package cn.lihongjie.json;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class JsonTest {
    @Test
    void testToMap() {
        Map<String, Object> map;
        map = Json.toMap("{}");
        Assertions.assertTrue(map.isEmpty());


        map = Json.toMap(" {\n" +
                "    \"_id\": \"6477f64398791ec907d7b338\",\n" +
                "    \"index\": 1,\n" +
                "    \"guid\": \"0a8d28e6-40bc-4453-a92e-a462b11b1399\",\n" +
                "    \"isActive\": true,\n" +
                "    \"balance\": \"$2,729.91\"\n" +
                "  }");
        assertEquals(5, map.size());

    }

    @Test
    void testToMap2() {
        Map<String, Object> map;
        map = Json.toMap("{\n" +
                "  \"k\": [1,2,null, false, true, 0.1]\n" +
                "}");

        Assertions.assertEquals(map.size(), 1);
        Assertions.assertEquals(((List) map.get("k")).size(), 6);
    }

    @Test
    void testToMap3() {
        Map<String, Object> map;
        map = Json.toMap("{\n" +
                "  \"k\": {\n" +
                "    \"k1\": \"v1\"\n" +
                "  }\n" +
                "}");

        Assertions.assertEquals(map.size(), 1);
        Assertions.assertEquals(((Map) map.get("k")).size(), 1);
    }

    @Test
    void testToMap4() {
        Map<String, Object> map;
        map = Json.toMap("{\n" +
                "  \"k\": [{\n" +
                "    \"k1\": \"v1\"\n" +
                "  }]\n" +
                "}");

        Assertions.assertEquals(map.size(), 1);
        Assertions.assertEquals(((List) map.get("k")).size(), 1);
    }


    @Test
    void testToList1() {
        List<Object> val;
        val = Json.toList("[]");

        Assertions.assertEquals(val.size(), 0);
    }
    @Test
    void testToList2() {
        List<Object> map;
        map = Json.toList("[1,2,3,4,5,null, 0.1]");

        Assertions.assertEquals(map.size(), 7);
    }

}