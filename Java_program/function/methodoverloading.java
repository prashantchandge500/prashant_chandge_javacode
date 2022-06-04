/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

/** method overloading means functions with same name but different parameter and return type
 * this example of changing the no of arguments.
 * @author hp
 */
public class methodoverloading {
    int a ;
    int b;
    int c;
    
    
    public void area(int n1,int n2){
       int result =n1*n2;
        System.out.println(result);
        
    }
    public void area(int n3){
        int result2=n3*n3;
        System.out.println(result2);
    }
    
    public static void main(String[] args) {
    
    
        methodoverloading m1 = new methodoverloading();
        methodoverloading m2 = new methodoverloading();
        m2.area(4);
        m1.area(5, 5);
        m1.area(6);
        
    }
    
}
