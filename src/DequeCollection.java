import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeCollection {
    public static void main(String[] args) {
        Deque<Object> deque1 = new ArrayDeque<>();
        Deque <Integer> deque2 = new LinkedList<>();

        deque1.add(2);
        deque1.add(4);
        System.out.println(deque1.getFirst() + "\n ---------");

        deque2.offerLast(1);
        deque2.offerLast(2);
        deque2.offerLast(3);

        Integer element;
        while ((element = deque2.pollFirst()) != null){
            System.out.println(element);
        }
    }
}


