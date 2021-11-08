package doublyLinkedList;

public class DoublyLinkedList {
    private ListNode head, tail;
    //head and tail are the reference variable pointing to the start and
    //end of DoublyLinkedList
    private int size;

    class ListNode{
        int data;
        ListNode previous, next;
        public ListNode(int data){
            this.data = data;
            this.previous = this.next = null;
        }
    }
}
