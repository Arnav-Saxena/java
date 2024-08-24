package fromScratch;
import java.util.*;

class Node 
{
    int data;
    Node next;

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}

public class linkedList 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(5, null);
        Node x = head;

        for(int i=0; i<=3; i++)
        {
            System.out.println("Enter a value");
            int value = sc.nextInt();

            Node n = new Node(value, null);

            head.next = n;

            head = head.next;
        }  
        
        System.out.println("Linked List- ");
        while(x.next != null)
        {
            System.out.print(x.data + ", ");
            x = x.next;
        }
        System.out.println(x.data);
        sc.close();
    }
}
