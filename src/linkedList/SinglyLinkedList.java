package linkedList;

import java.awt.*;

public class SinglyLinkedList {
    private ListNode head;
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        sll.head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
    }
    public static void traversal(ListNode head){
        ListNode current = head;
        while (current!=null){
            System.out.println(current.getData()+"-->");
        }
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

    public int getData() {
        return data;
    }
}
