import java.io.*;
import java.util.*;

class Parent{
    void print(){
        System.out.println("parent class");
        
    }
}
class Child1 extends Parent{
     void print(){
        System.out.println("child1 class");
    }
}

class Child2 extends Parent{
     void print(){
        System.out.println("child2 class");
    }
}
public class Runtimepoly {
    public static void main(String[] args) {
        Parent a;
        
        a=new Child1();
        a.print();
        
        a= new Child2();
        a.print();
        
        
    }
}

