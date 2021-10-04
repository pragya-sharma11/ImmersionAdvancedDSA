package linkedList;

import java.awt.*;

public class SinglyLinkedList {
    private ListNode head;
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

    }
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
