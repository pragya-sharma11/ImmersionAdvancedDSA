package linkedList;

import java.util.Scanner;

public class LinkedListWithAddFirst {
    static ListNode head;
    static class ListNode {
        private int data;
        private ListNode next;

        public ListNode() {
            this.data = Integer.parseInt(null);
            this.next = null;
        }

        public ListNode(int data) {
            this.data = data;
        }

        public ListNode(ListNode next) {
            this.next = next;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }

    public static void main(String[] args) {
        LinkedListWithAddFirst ll = new LinkedListWithAddFirst();
        head = new ListNode(90);
        addFirst(56, head);
        addLast(89, head);
        addLast(45, head);
    }
    public static ListNode addFirst(int n, ListNode head){
        ListNode node = new ListNode(n);
        node.setNext(head);
        head = node;
        return head;
    }
    public static void addLast(int n, ListNode head){
        ListNode newNode = new ListNode(n);
        if(head==null){
            head = newNode;
            return;
        }
        ListNode cur = head;
        while(cur.getNext()!=null){
            cur = cur.getNext();
        }
        cur.next = newNode;

    }
}
