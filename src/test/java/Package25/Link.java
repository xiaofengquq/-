package Package25;

/*
    单链表
        优点：随机增删元素效率较高
            因为每个元素内存地址不连续，只需要将待删除元素上一个节点的next指向待删除元素的next即可
            不涉及大量元素的位移
        缺点：查询效率较低，每次查找某个元素都需要从头节点开始向下遍历
 */

/**
 * 链表数据结构的实现类
 */
public class Link {

    // 头节点
    private Node header = null;
    private int size = 0;

    /**
     * 向链表中添加元素
     *
     * @param obj 要添加的元素
     */
    public void add(Object obj) {
        Node newNode = new Node(obj);
        if (header == null) {
            header = newNode;
        } else {
            Node temp = header;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    /**
     * 删除链表中的元素
     *
     * @param obj 要删除的元素
     * @return true：删除成功，false：删除失败
     */
    public boolean remove(Object obj) {
        Node current = find(obj);
        Node previous = findPrevious(obj);
        if (header == null || current == null) {
            return false;
        } else if (previous == null) {
            header = current.next;
            size--;
            return true;
        } else {
            previous.next = current.next;
            size--;
            return true;
        }
    }

    /**
     * 修改链表中的元素
     *
     * @param oldObj 要修改的元素
     * @param newObj 修改后的元素
     * @return true：修改成功，false：修改失败
     */
    public boolean modify(Object oldObj, Object newObj) {
        Node current = find(oldObj);
        if (current == null) {
            return false;
        } else {
            current.element = newObj;
            return true;
        }
    }

    /**
     * 查找链表中的元素
     *
     * @param obj 要查找的元素
     * @return 找到的元素节点，若未找到则返回null
     */
    public Node find(Object obj) {
        Node temp = header;
        while (temp != null) {
            if (temp.element.equals(obj)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    /**
     * 查找链表中某个元素的上一个节点
     *
     * @param obj 要查找的元素
     * @return 上一个节点，若未找到或为头节点则返回null
     */
    public Node findPrevious(Object obj) {
        Node previous = null;
        Node temp = header;
        while (temp != null) {
            if (temp.element.equals(obj)) {
                return previous;
            }
            previous = temp;
            temp = temp.next;
        }
        return null;
    }

    /**
     * 打印链表中的所有元素
     */
    public void printLink() {
        Node temp = header;
        while (temp != null) {
            System.out.println(temp.element);
            temp = temp.next;
        }
    }

    /**
     * 获取链表的大小（元素个数）
     *
     * @return 链表的大小
     */
    public int getSize() {
        return size;
    }
}
