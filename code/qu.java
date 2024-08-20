import java.util.LinkedList;
import java.util.Queue;

public class qu 
{
    public static void main(String[] args) 
    {
        //FIFO data structure. jo pahle aayega, woh pahle dikhega.
        Queue<String> queue = new LinkedList<String>();
        //offer() add , poll() remove , peek() peek

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue);

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));
    }
}