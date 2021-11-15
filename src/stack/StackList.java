package stack;

import java.util.NoSuchElementException;

public class StackList {
    private ListNode top;
    private int length;
    public void push(int data){
        length++;
        if(top == null){
            top = new ListNode(data);
        }
        ListNode newNode = new ListNode(data);
        newNode.next = top;
        top = newNode;
    }
    public int pop(){
        if(top==null){
            throw new NoSuchElementException("Stack is empty!!");
        }
        int deletedData = top.data;
        top = top.next;
        length--;
        return deletedData;
    }
    public int peek(){
        if(top == null){
            throw new NoSuchElementException("Stack is empty");
        }
        return top.data;
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