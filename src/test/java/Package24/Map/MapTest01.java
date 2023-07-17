package Package24.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Map集合的遍历
 */
public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("1", "abc");
        map.put("2", "def");
        map.put("3", "ghi");
        map.put("4", "jkl");
        map.put("5", "mno");

        //  第一种方式：获取所有的key，通过所有的key来遍历value
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s + " = " + map.get(s));
        }

        System.out.println("---------------------------");

        //  第二种方式：Set<Map.Entry<K, V>> entrySet();
        //  把Map集合直接转换成Set集合，集合中元素的类型为Map.Entry<K, V>
        //  Map.Entry<K, V>提供了get方法
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
