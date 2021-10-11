package linkedList;

public class LinkedListWithAddFirst {
    static ListNode head;
    static class ListNode {
        private int data;
        private ListNode next;

        public ListNode() {
            this.data = Integer.parseInt(null);
            this.next = null;
        }

        public ListNode(int data) {
            this.data = data;
        }

        public ListNode(ListNode next) {
            this.next = next;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }

    public static void main(String[] args) {
        LinkedListWithAddFirst ll = new LinkedListWithAddFirst();
        addFirst(56);
        addLast(89);
        addLast(45);
        addFirst(82);
        addLast(73);
        addLast(56);
        System.out.println("List after adding the nodes.");
        printTraversal();
        removeFirst();
        System.out.println("List after calling removeFirst()");
        printTraversal();
        removeLastBySir();
        System.out.println("List after calling removeLastBySir()");
        printTraversal();
    }
    public static void addFirst(int n){
        ListNode node = new ListNode(n);
        if(head == null){
            head = node;
            return ;
        }
        node.setNext(head);
        head = node;

    }
    public static void addLast(int n){
        ListNode newNode = new ListNode(n);
        if(head==null){
            head = newNode;
            return;
        }
        ListNode cur = head;
        while(cur.getNext()!=null){
            cur = cur.getNext();
        }
        cur.next = newNode;
    }

    public static ListNode removeFirst(){
        if(head==null){
            return null;
        }
        ListNode dltNode = head;
        head = head.getNext();
        dltNode.setNext(null);
        return dltNode;
    }

    public static ListNode removeLastBySir() {
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next!=null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }
    public static ListNode myRemoveLast(){
        if(head == null || head.next==null ){
            return head;
        }
        ListNode curr = head;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        ListNode dlt = curr.next;
        curr.next = null;
        return dlt;
    }

    public static void printTraversal() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.getData() + "-->");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
