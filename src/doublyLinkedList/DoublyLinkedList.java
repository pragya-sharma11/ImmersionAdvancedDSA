package doublyLinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private ListNode head, tail;
    //head and tail are the reference variable pointing to the start and
    //end of DoublyLinkedList
    private int size;
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean isEmpty(){
        return size==0; //head == null;
    }

    //addfirst
    public void addFirst(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){  //we can do (head==null) but we need to show the usage of isEmpty.
//            tail = head = newNode;
            tail = newNode;
        }else {
            head.previous = newNode;
//            newNode.next = head;
//            head = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    //addLast
    public void addLast(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        size++;
    }


    //remove
    public int removeFirst(){
        int dltData = 0;
        if(isEmpty()){
            throw  new NoSuchElementException("The Doubly linked list is empty");
        }else if(size==1){
            dltData = head.data;
            head = tail = null;
        } else {
            dltData = head.data;
            head = head.next;
            head.previous = null;
        }
        size--;
        return dltData;
    }
    //before if -> temp=head;
    //head.next.prev = null ---else
    //after else-> head = head.next;temp.next = null;length--;
    public int removeLast(){
        int dltData = 0;
        if(isEmpty()){
            throw  new NoSuchElementException("The Doubly linked list is empty");
        }else if(size==1){
            dltData = head.data;
            head = tail = null;
        } else {
            dltData = tail.data;
            tail = tail.previous;
            tail.next = null;
        }
        size--;
        return dltData;
    }


    //print in forward direction
    public void displayForward(){
        ListNode curr = head;
        while(curr!=null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }

    //print in backward direction
    public void displayBackward(){
        ListNode curr = tail;
        while (curr!=null){
            System.out.print(curr.data + " -> ");
            curr = curr.previous;
        }
    }
    class ListNode{
        int data;
        ListNode previous, next;
        public ListNode(int data){
            this.data = data;
            this.previous = this.next = null;
        }
    }
}
