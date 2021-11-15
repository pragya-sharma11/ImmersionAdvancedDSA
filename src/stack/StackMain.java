package stack;

public class StackMain {
    public static void main(String[] args) {
        StackList sl = new StackList();
        sl.push(56);
        sl.push(34);
        sl.push(87);
        sl.push(98);

        System.out.println(sl.pop());
        System.out.println(sl.pop());
        System.out.println(sl.peek());
    }
}
