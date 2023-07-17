package Package24.Map;

import java.util.HashMap;
import java.util.Map;
/*
    HashMap集合key部分允许为null吗？
        允许，HashMap的key，null值只能有一个
 */
public class HashMapTest02 {
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();
        map.put(null, null);
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}
