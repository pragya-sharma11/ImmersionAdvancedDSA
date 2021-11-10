package circularLinkedList;

public class CircularLinkedList {
    ListNode last;
    int size;
    public  void createLinkedList(){
        ListNode first = new ListNode(56);
        ListNode second = new ListNode(56);
        ListNode third = new ListNode(56);
        ListNode fourth = new ListNode(56);
        size = 4;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        last = fourth;
    }

    public  void displayList(){
        if(last == null){
            return;
        }
        ListNode first = last.next;
        while (first!=last){
            System.out.print(first.data + " -> ");
        }
    }
    class ListNode{
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

}
