import java.util.*;

public class stac
{
    public static void main (String[] args)
    {
        Stack<String> stack = new Stack<String>();

        // LIFO data structre, jo last input hoga, woh first output hoga
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Megaman");
        stack.push("Sonic");

        //String str = stack.pop();

        System.out.println(stack);

        //System.out.println(stack.empty());

        //System.out.println(stack.peek());
    
        //stack.push("Minceraft");

        //stack.search("Sonic"); (its not 0, its 1)

    }
}