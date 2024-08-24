import java.util.*;

public class prioqu 
{
    //queue but arranged in an order
    public static void main(String[] args)
    {
        Queue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        System.out.println(queue);
    }
}
