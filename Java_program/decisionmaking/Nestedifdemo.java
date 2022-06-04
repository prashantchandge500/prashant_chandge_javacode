
package decisionmaking;

public class Nestedifdemo {
  
        int num = 102;
        
        public void show3(){
        
        if(num>100){
            if(num<120){
                if(num%2==0){
                    System.out.println("number is even");
                }
                else{
                    System.out.println("number is odd");
                }
            }
        }
    }
    
}
