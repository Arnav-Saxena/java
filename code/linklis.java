import java.util.*;
public class linklis 
{
    public static void main(String[] args) 
    {
        LinkedList<String> linkedList = new LinkedList<String>();

        //linked list as a stack LIFO

        linkedList.push("A");
        linkedList.push("B");
        System.out.println(linkedList);

        linkedList.pop();
        System.out.println(linkedList);

        linkedList.pop();
        System.out.println(linkedList.isEmpty());

        //linked List as a queue FIFO

        linkedList.offer("C");
        linkedList.offer("D");
        System.out.println(linkedList);

        linkedList.poll();
        System.out.println(linkedList);

        linkedList.poll();
        System.out.println(linkedList.isEmpty());

        //insertion and deletion of nodes in linked lists

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        
        linkedList.add(4, "E");
        System.out.println(linkedList);

        linkedList.remove("E");
        System.out.println(linkedList);

        //searching for an element is also fairly simple

        System.out.println(linkedList.indexOf("A"));

        //we can peek add and remove head and tail of linked list

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("0");
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);

    }
}
