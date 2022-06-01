import java.io.*;
import java.util.*;

public class Stackmultivalues {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack<String> stack2 = new Stack<String>();
        
        stack1.push(5);
        stack1.push("prashant");
        stack1.push(10.5);
        stack1.push("");
        
        stack2.push("dipack");
        stack2.push("lodwal");
        
        System.out.println(stack1);
        System.out.println(stack2);
        
        stack1.pop();
        System.out.println(stack1.pop());
        System.out.println(stack1);
        
        stack2.empty();
        System.out.println(stack2.empty());
        
        stack1.search(9);
        System.out.println(stack1.search(9));
                
        
    }
}
