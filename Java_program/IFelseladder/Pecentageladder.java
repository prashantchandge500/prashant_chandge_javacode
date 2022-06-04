
package IFelseladder;

public class Pecentageladder {
     double marks =61.0;
     
     public void show(){
         
         if(marks>=750.){
             System.out.println("Distiction");
         }
         else if(marks>=60.0 && marks<=74.99){
             System.out.println("first class");
         }
         else if(marks>=45.0 && marks<=59.99){
             System.out.println("second class");
         }
         else if(marks>=40){
             System.out.println("pass");
         }
         else{
             System.out.println("fail");
         }
     }
     
}
    
       
