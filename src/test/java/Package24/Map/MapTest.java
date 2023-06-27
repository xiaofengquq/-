package Package24.Map;

import java.util.*;

/**
 * java.util.Map接口中常用的方法：
 *  1、Map和Collection没有继承关系。
 *  2、  Map集合以key和value的方式存储数据：键值对
 *      key和value都是引用数据类型
 *      key和value都是存储对象的内存地址
 *       key起到主导的地位，value是key的一个附属品
 * 3、Map接口中的常用方法：
 *      V put(K key, V value);  向Map集合中添加键值对
 *      void clear();           清空Map集合
 *      int size();             获取Map集合键值对数量
 *      boolean isEmpty();      判断Map集合中元素个数是否为0
 *      boolean containsKey(Object key);    判断Map集合是否包含某个key（底层调用equals()方法）
 *      boolean containsValue(Object key);  判断Map集合是否包含某个value（底层调用equals()方法）
 *      V get(Object key);      根据key获取value
 *      V remove(Object key);   根据key删除键值对
 *      Set<K> keySet();        返回只包含key的Set集合
 *      Collection<V> values(); 返回只包含value的Collection集合
 *      Set<Map.Entry<K, V>> entrySet();    将Map集合转换为Set集合
 */
public class MapTest {
    //  【 注意：Set集合中元素的类型是 Map.Entry<String, String> 】
    //  Map.Entry和String一样，都是一种类型的名字
    //  只不过Map.Entry是Map中的内部接口
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        //  entrySet()方法演示
        map.put("1", "abc");
        map.put("2", "def");
        map.put("3", "ghi");
        map.put("4", "jkl");
        map.put("5", "mno");

        Set<Map.Entry<String, String>> set = map.entrySet();
        System.out.println(set);//  [1=abc, 2=def, 3=ghi, 4=jkl, 5=mno]

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "abc");
        map1.put(2, "def");
        map1.put(3, "ghi");
        map1.put(4, "jkl");
        map1.put(5, "mno");

        System.out.println("-----------------------------------");
        System.out.println(map1.get(2));//  从map1中获取key为 2 的value
        //  def

        System.out.println(map1.size());//  5
        map1.remove(2);

        System.out.println(map1.size());//  5 - 1  = 4
        System.out.println(map1.containsKey(2));//  判断map1中是否包含key为 2 的键值对
        //  false(key = 2, value = def的键值对被remove了)

        Set<Integer> integers = map1.keySet();
        Collection<String> collection = map1.values();
        System.out.println("map1's keys: " + integers);
        System.out.println("map1's values: " + collection);
    }
}
