
package Loopsprogram;
public class Labellstatementdemo {
  
        
    
     public void show4(){
        first:
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==1){
                    continue first;
                }
                System.out.println("[ i " + i + "," + " j " + j +" ] ");
            }
        }
            System.out.println();
        
    
        second:
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==1){
                    break second;
                }
                System.out.println("[ i " + i + "," + " j " + j +" ] ");          
            }
        }
         System.out.println();
    }
   
    
}
