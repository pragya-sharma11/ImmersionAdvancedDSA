package doublyLinkedList;

public class DoublyLinkedList {
    private ListNode head, tail;
    //head and tail are the reference variable pointing to the start and
    //end of DoublyLinkedList
    private int size;
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean isEmpty(){
        return size==0; //head == null;
    }
    public void addFirst(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){  //we can do (head==null) but we need to show the usage of isEmpty.
            tail = head = newNode;
        }else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    class ListNode{
        int data;
        ListNode previous, next;
        public ListNode(int data){
            this.data = data;
            this.previous = this.next = null;
        }
    }
}
