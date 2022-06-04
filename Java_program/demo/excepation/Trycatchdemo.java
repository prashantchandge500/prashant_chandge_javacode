
package demo.excepation;
import java.util.*;

public class Trycatchdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the first value");
         int a = sc.nextInt();
       
        System.out.println("enter the second value ");
        int b = sc.nextInt();
        
        try{
            b=b/a;
            System.out.println(b);
        } catch (ArithmeticException e) {
            System.out.println("Excepation occure due to:: divide by zero");
        }
         
        
    }
    
}

