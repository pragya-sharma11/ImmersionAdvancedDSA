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

    //addfirst
    public void addFirst(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){  //we can do (head==null) but we need to show the usage of isEmpty.
//            tail = head = newNode;
            tail = newNode;
        }else {
            head.previous = newNode;
//            newNode.next = head;
//            head = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    //addLast
    public void addLast(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        size++;
    }

    //print
    public void displayForward(){
        ListNode curr = head;
        while(curr!=null){
            System.out.print(curr.data + "  ");
            curr = curr.next;
        }
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
