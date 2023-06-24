package Package24.Collection.LinkTest;

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
public class Link<E> {

    // 头节点
    private Node header = null;
    private int size = 0;

    /**
     * 向链表中添加元素
     *
     * @param data 要添加的元素
     */
    public void add(E data) {
        Node newNode = new Node(data);
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
     * @param data 要删除的元素
     * @return true：删除成功，false：删除失败
     */
    public boolean remove(E data) {
        Node current = find(data);
        Node previous = findPrevious(data);
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
     * @param oldData 要修改的元素
     * @param newData 修改后的元素
     * @return true：修改成功，false：修改失败
     */
    public boolean modify(E oldData, E newData) {
        Node current = find(oldData);
        if (current == null) {
            return false;
        } else {
            current.element = newData;
            return true;
        }
    }

    /**
     * 查找链表中的元素
     *
     * @param data 要查找的元素
     * @return 找到的元素节点，若未找到则返回null
     */
    public Node find(E data) {
        Node temp = header;
        while (temp != null) {
            if (temp.element.equals(data)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    /**
     * 查找链表中某个元素的上一个节点
     *
     * @param data 要查找的元素
     * @return 上一个节点，若未找到或为头节点则返回null
     */
    public Node findPrevious(E data) {
        Node previous = null;
        Node temp = header;
        while (temp != null) {
            if (temp.element.equals(data)) {
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
