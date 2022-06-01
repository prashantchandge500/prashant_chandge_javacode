import java.io.*;

public class casting {
    public static void main(String[] args) {
        //automatic(widening casting)
    int myint=10;
    double mydouble = myint;
    System.out.println(myint);
    System.out.println(mydouble);
        
    int a=5;
    float b=a;
    System.out.println(b);
    
    byte c= 4;
    long d= c;
    System.out.println(d);
        
        
    // manually(narrowing casting)
    double mydoubl1=10.4;
    int myint1 = (int) mydoubl1;
    
   int z=5;
   int z1= (byte)z;
        System.out.println(z1);
    
    
    
        
        
    
    
    
        
    }
   
    
    
}
