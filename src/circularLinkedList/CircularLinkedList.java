package circularLinkedList;

public class CircularLinkedList {
    ListNode last;
    int size;
    //brute force.
    public  void createLinkedList(){
        ListNode first = new ListNode(56);
        ListNode second = new ListNode(45);
        ListNode third = new ListNode(78);
        ListNode fourth = new ListNode(1568);
        size = 4;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        last = fourth;
    }

    public void addFirst(int data){
        ListNode newNode = new ListNode(data);
        if(last==null){
            last = newNode;
        } else {
            newNode.next = last.next;
        }
        last.next = newNode;
        size++;
    }

    public  void displayList(){
        if(last == null){
            return;
        }
        ListNode first = last.next;
        while (first!=last){
            System.out.print(first.data + " -> ");
            first = first.next;
        }
        System.out.println(last.data);
    }
    class ListNode{
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

}