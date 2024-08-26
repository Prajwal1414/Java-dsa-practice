
import java.util.PriorityQueue;

public class LearnPriorityQueue{
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(); //To reverse the priority, i.e to set priority to highest value we can pass Comparator.reverseOrder() as a parameter   ^ here

        pq.offer("Prajwal");
        pq.offer("Kumar");
        pq.offer("Harshita");

        System.out.println(pq);
        System.out.println(pq.poll());

        System.out.println(pq);
        System.out.println(pq.peek());

        pq.offer("Hello");
        System.out.println(pq);
        System.out.println(pq.poll());

    }
}

//The highest priority is for the lowest value, and this is the element that is at the front of the queue. The remaining elements can be in some strange order. 

//The same functions as in Queue i.e offer(), poll(), peek(). 