
package IFelseladder;
import decisionmaking.*;

import Switch.*;

public class Ladder {
    public static void main(String[] args) {
      Returndemo r  = new Returndemo();
      r.display1();
        Switchdemo1 s = new Switchdemo1();
        s.weekdays();
        System.out.println(" ");
        Pecentageladder p = new Pecentageladder();
        p.show();
        System.out.println(" ");
        Decisionmaking d = new Decisionmaking();
        d.show1();
        System.out.println(" ");
        Nestedifdemo n = new Nestedifdemo();
        n.show3();
        System.out.println(" ");
        
        double age_group =25; 
       
        if(age_group<=5.0){
            System.out.println("child");
        }
        else if(age_group>=5.1 && age_group<=19.0){
            System.out.println("Teeager age");    
    }
        else if(age_group>=19.1 && age_group<=25.0){
            System.out.println("younger");
        
    }
        else if(age_group>=25.1 && age_group<=45.0){
            System.out.println("Middel age");
        }
        else if(age_group>=45.1 && age_group<=60.0){
            System.out.println("old age");
        }
        else{
            System.out.println("invalid age");
        }
  
        
    }
    
}
