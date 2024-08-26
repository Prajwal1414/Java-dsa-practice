
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue{
    public static void main(String[] args) {
        
        Queue<String> q = new LinkedList<>(); //queue is an abstract class. It is an interface implemented by LinkedList<>() or PriorityQueue<>();
            q.offer("Prajwal");
            q.offer("Hello");
            q.offer("Woman");

            System.out.println(q);

            System.out.println(q.poll()); //removes and returns the front end

            System.out.println(q.peek());

            Iterator<String> it = q.iterator();

            System.out.println("Printed using iterators");
            while (it.hasNext()) {
                System.out.println(it.next()); 
            }
        }
}

/*
 * offer()
 * poll()
 * peek()
 */



