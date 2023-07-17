package Package24.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
    Hashtable集合key部分允许为null吗？
        不允许，Hashtable的key和value都是不允许为空的

    HashTable中的方法都带有synchronized：线程安全的
    但是线程安全有其他方案，因此现在基本上不用HashTable

    HashTable和HashMap一样，底层都是哈希表数据结构
 */
public class HashMapTest03 {
    public static void main(String[] args) {
        Map<Object, Object> map = new Hashtable<>();
        map.put(null, null);
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}
