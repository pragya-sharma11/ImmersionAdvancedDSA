package linkedList;

public class MidNodeOfLinkedList {
    public ListNode tellMidNode(ListNode node){
        ListNode first = node;
        ListNode sec =   node;
        while (first.getNext()!=null && sec.getNext().getNext()!=null){
            first = first.getNext();
            sec = sec.getNext().getNext();
        }
        return first; //remember:-when you call it must print and.data otherwise it will give you hash value.
    }
}
