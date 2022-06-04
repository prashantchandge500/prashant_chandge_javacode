/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.excepation;

/**
 *
 * @author hp
 */
public class Trycatchdemo1 {
    public static void main(String[] args) {
        
    
    int a=0 , b=10 ,c;
        try {
            c = b/a;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Arthmatic Excepation");
        }
        
        System.out.println("hello prashant");
        c=a+b;
        System.out.println(c);
        }
   
}
