package stack;

import java.util.NoSuchElementException;

public class StackList {
    private ListNode top;
    private int length;
    public int pop(){
        if(length<=0){
            throw new NoSuchElementException("Stack is empty!!");
        }
        int deletedData = top.data;
        top = top.next;
        return deletedData;
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