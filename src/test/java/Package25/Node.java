package Package25;
/*
    单链表中的节点
        节点是单向链表中的基本单元
        每个节点Node都有两个属性
            1、存储的数据
            2、下一个节点的内存地址
 */
public class Node {
    //  存储的数据
    Object element;
    //  下个节点的内存地址
    Node next;

    public Node() {
    }

    public Node(Object obj) {
        this.element = obj;
    }

    public Node(Object obj, Node nextNode) {
        this.element = obj;
        this.next = nextNode;
    }
}
