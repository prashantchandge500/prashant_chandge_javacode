import java.io.*;
import java.util.*;

class One{
       
    public void printone(){
       System.out.println("one class called");
   }
}

class Two extends One {
    
    public void printtwo(){
        System.out.println("two class called");
    }
}

class Three extends One {
    
    public void printthree(){
        System.out.println("three class called");
    }
}

class Four extends One {
    
    public void printfour(){
        System.out.println("four class called");
    }
}

public class Hierichicalinheritance {
    public static void main(String[] args) {
        Two f1=new Two();
        Three f2= new Three();
        Four f3= new Four();
        
         f1.printone();
         f1.printtwo();
         f2.printthree();
         f3.printfour();
                
        
    }
}

