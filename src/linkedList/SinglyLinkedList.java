package linkedList;

public class SinglyLinkedList {
    private ListNode head  = new ListNode(10);
    private ListNode second  = new ListNode(10);
    private ListNode third  = new ListNode(10);
    private ListNode fouth  = new ListNode(10);
    head.
}

class ListNode{
    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode(ListNode next) {
        this.next = next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
