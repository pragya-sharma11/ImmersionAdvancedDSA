package linkedList;

public class NthNodeFromEnd {
    public ListNode getNthNodeFromEnd(int n, ListNode head){
        if(head==null){
            return null;
        }
        if(n<=0)
            throw new IllegalArgumentException("Invalid N");
        ListNode mainPtr = head;
        ListNode ref = head;
        int count = 0;
        while(count<n){
            ref = ref.getNext();
            count++;
        }
        while (ref!=null){
            ref = ref.getNext();
            mainPtr = mainPtr.getNext();
        }
        return mainPtr;
    }
}
