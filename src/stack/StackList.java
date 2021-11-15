package stack;

import java.util.NoSuchElementException;

public class StackList {
    private ListNode top;
    private int length;
    public void push(int data){
        length++;
        if(isEmpty()){
            top = new ListNode(data);
        }
        ListNode newNode = new ListNode(data);
        newNode.next = top;
        top = newNode;
    }
    public int pop(){
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empty!!");
        }
        int deletedData = top.data;
        top = top.next;
        length--;
        return deletedData;
    }
    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        return top.data;
    }
    public boolean isEmpty(){
        return top == null;
    }
    class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}