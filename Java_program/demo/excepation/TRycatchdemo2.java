

package demo.excepation;
import java.util.Scanner;
import java.util.InputMismatchException;
public class TRycatchdemo2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter the first value");
            int a= sc.nextInt();
            System.out.println("enrter the second value ");
            int b = sc.nextInt();
            try {
              int c= a/b;
              System.out.println(c);   
            } catch (ArithmeticException e) {
             System.out.println("arthmatuic Excepatin occure due to :: divide by zero");
            }
        }catch (InputMismatchException e) {
             System.out.println("Mismatch excepation due to ::inter the integer");
         }
         System.out.println("hello prashant");
         System.out.println("hello dipak12");
         }
        
        
        

        
    
}
