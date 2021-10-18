package linkedList;

public class InsertInSortedList {
    public ListNode insertNode(ListNode head, int val){
        ListNode newNode = new ListNode(val);
        if(head==null)
            return newNode;
        ListNode temp = null;
        ListNode curr = head;

        while (curr!=null && curr.getData()<val){
            temp = curr;
            curr = curr.getNext();
        }
        newNode.setNext(curr);
        temp.setNext(newNode);
        return head;
    }
}
