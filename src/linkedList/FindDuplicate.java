package linkedList;

public class FindDuplicate {
    public ListNode removeDuplicate(ListNode head){
        if(head == null){
            return null;
        }
        ListNode curr = head;
        while(curr!=null && curr.getNext()!=null ){
            if(curr.getData() == curr.getNext().getData()){
                curr.setNext(curr.getNext().getNext());
            }else {
                curr = curr.getNext();
            }
        }
        return head;
    }
}
