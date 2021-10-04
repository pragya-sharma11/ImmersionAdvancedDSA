package linkedList;

public class SinglyLinkedList {
    private ListNode head  = new ListNode(10);

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
}
