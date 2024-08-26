import java.util.Iterator;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();
        nums.push(1);
        nums.push(2);
        nums.push(3);

        System.out.println(nums);

        System.out.println(nums.peek());

        Iterator<Integer> it = nums.iterator();

        System.out.println("This is printed using iterator");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        nums.pop();
        System.out.println(nums);
    }
}

/*
 * push()
 * pop()
 * peek()
 */
