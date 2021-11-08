package doublyLinkedList;

public class MainClassForDLL {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(56);
        dll.addFirst(76);
        dll.addFirst(34);
        //dll.displayForward()
        dll.displayForward();
        dll.addLast(90);
        dll.addLast(90);
        dll.addLast(90);
        System.out.println();
        dll.displayBackward();
        dll.removeFirst();
        System.out.println();
        dll.displayForward();

    }
}
