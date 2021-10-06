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
        System.out.println(head.data);
        addLast(89, head);
        addLast(45, head);
        addFirst(82);
        addLast(73,head);
        printTraversal(head);
        removeFirst();
        printTraversal(head);
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
    public static void addLast(int n, ListNode head){
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
    public static void printTraversal(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.getData() + "-->");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
