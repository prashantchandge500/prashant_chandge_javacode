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


class Four extends One{
    
    public void printfour(){
        System.out.println("four class called");
    }
}
class Five extends Two{
    public void printfive(){
        System.out.println("five class called");
    }
}

public class Hybridinheritance {
    public static void main(String[] args) {
        One f= new One();
        Two f1=new Two();
        Three f2= new Three();
        Four f3= new Four();
        Five f4= new Five();
        
         f.printone();
         f1.printtwo();
         f2.printthree();
         f3.printfour();
         f4.printfive();
                
        
    }
}


