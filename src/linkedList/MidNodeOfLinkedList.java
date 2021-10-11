package linkedList;

public class MidNodeOfLinkedList {
    public ListNode tellMidNode(ListNode node){
        ListNode first = node;
        ListNode sec =   node;
        while (first.getNext()!=null && sec.getNext()!=null){
            first = first.getNext();
            sec = sec.getNext().getNext();
        }
        return first;
    }
}
