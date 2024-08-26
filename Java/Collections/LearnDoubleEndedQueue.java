
import java.util.ArrayDeque;

public class LearnDoubleEndedQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        
        adq.offer(2);
        adq.offerFirst(1);
        adq.offerLast(3);
        adq.offer(4);
        adq.offer(5);
        
        System.out.println(adq);

        adq.poll();
        System.out.println("After poll()" +adq);

        adq.pollLast();
        System.out.println("After pollLast()"+adq);

        adq.pollFirst();
        System.out.println("After pollFirst()" +adq);

        System.out.println("Peek first" +adq.peek());
        System.out.println("Peek last" +adq.peekLast());
    }
}

//ArrayDeque is nothing but a double ended queue
/*
 * offer()
 * offerFirst()
 * offerLast()
 * poll()
 * pollFirst()
 * pollLast()
 * peek()
 * peekFirst()
 * peekLast()
 */