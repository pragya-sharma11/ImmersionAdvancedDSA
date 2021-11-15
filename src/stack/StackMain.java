package stack;

public class StackMain {
    public static void main(String[] args) {
        StackList sl = new StackList();
        sl.push(56);
        sl.push(34);
        sl.push(87);
        sl.push(98);
        System.out.println("stack is");
        sl.display();
        System.out.println();
        System.out.println("pop->"+sl.pop());
        System.out.println("pop->"+sl.pop());
        System.out.println("peek->"+sl.peek());
    }
}
