package circularLinkedList;

public class CircularLinkedListMainClass {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addFirst(45);
        cll.addFirst(78);
        cll.addFirst(37);
        cll.addLast(85);
        cll.addLast(75);
        cll.addLast(65);
        cll.displayList();
    }
}
