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

class Three extends Two {
    
    public void printthree(){
        System.out.println("three class called");
    }
}

class Four extends Three {
    
    public void printfour(){
        System.out.println("four class called");
    }
}

public class Multilevelinheritance {
    public static void main(String[] args) {
        Four f=new Four();
        
         f.printone();
         f.printtwo();
         f.printthree();
         f.printfour();
                
        
    }
    
}
