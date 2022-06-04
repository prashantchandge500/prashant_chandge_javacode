
package demo.excepation;
public class Multiplecatchdemo {
    public static void main(String[] args) {
        try {
            int myarry[]= new int[5];
            myarry[6]=10/0;
            System.out.println(myarry[5]);
            System.out.println(myarry[4]);
            
        } catch (ArithmeticException e) {
            System.out.println("Excepatin: " +e.getMessage());
        }
       catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Excepation: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("EXcepatin: " + e.getMessage());
        }
        
            
        }
    }
    

