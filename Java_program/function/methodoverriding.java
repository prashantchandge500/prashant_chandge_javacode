/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

/**
 *he method must have the same name as in the parent class
The method must have the same parameter as in the parent class.
There must be an IS-A relationship (inheritance).
 * @author hp
 * 
 */
class hello{
    public static void say(){
        System.out.println("hello everyone");
    }
}
class hello1 extends hello {
    public static void say(){
        System.out.println("hello everyone");
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        hello1 h = new hello1();
        
        h.say();
        h.say();
                
        
    }
   
    
    
    
}
