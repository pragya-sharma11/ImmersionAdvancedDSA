package doublyLinkedList;

public class DoublyLinkedList {

    class ListNode{
        int data;
        ListNode previous, next;
        public ListNode(int data){
            this.data = data;
            this.previous = this.next = null;
        }
    }
}
