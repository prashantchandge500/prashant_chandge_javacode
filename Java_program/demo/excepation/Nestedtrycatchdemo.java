
package demo.excepation;
public class Nestedtrycatchdemo {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[4]=10;
            System.out.println("inside the block");
            try{
                System.out.println("first block");
                int num=10/1;
                System.out.println(num);
            } catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
            try {
                System.out.println("second block");
                int num =15/2;
                System.out.println(num);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());  
        }
     
        catch(Exception e){
                System.out.println(" block1 and block2");
                }
    }
    
}
