package Package24.Map;

/**
    java.util.Map接口中常用的方法：
        1、Map和Collection没有继承关系。
        2、  Map集合以key和value的方式存储数据：键值对
            key和value都是引用数据类型
            key和value都是存储对象的内存地址
            key起到主导的地位，value是key的一个附属品

        3、Map接口中的常用方法：
            V put(K key, V value);  向Map集合中添加键值对
            void clear();           清空Map集合
            int size();             获取Map集合键值对数量
            boolean isEmpty();      判断Map集合中元素个数是否为0
            boolean containsKey(Object key);    判断Map集合是否包含某个key
            boolean containsValue(Object key);  判断Map集合是否包含某个value
            V get(Object key);      根据key获取value
            V remove(Object key);   根据key删除键值对
            Set<K> keySet();        返回只包含key的Set集合
            Collection<V> values(); 返回只包含value的Collection集合
            Set<Map.Entry<K, V>> entrySet();
*/
public class MapTest {
    public static void main(String[] args) {
    }
}
