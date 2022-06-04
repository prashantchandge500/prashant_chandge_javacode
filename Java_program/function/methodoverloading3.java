/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

/**
 *
 * @author hp
 */
public class methodoverloading3 {
     public static void hello(){
         System.out.println("say hi");
         
     }
     public static void hello(String s){
         System.out.println("say bye");
     }
    public static void main(String[] args) {
        hello("gdh");
        hello();
    }
}
