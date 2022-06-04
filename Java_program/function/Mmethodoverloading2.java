/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

/**
 *this is example of changing the type of arguments\\parameter
 * @author hp
 */
public class Mmethodoverloading2 {
    
   public static int add(int n1,int n2,int n3){
       int result = n1+n2+n3;
       return result;
   }
   public static float add(float n1,float n2){
       float result = n1 +n2;
       return result;
   }
    public static void main(String[] args) {
       // System.out.println(add(5, 5, 5));
       // System.out.println(add(4.5f, 4.5f));
       int a = 5;
       int b= 5;
       int c = 5;
        float f1=4.5f;
        float f2 = 4.5f;
        
        int result_add= add(a, b, c);
        float result1_add =add(f1, f2);
        System.out.println(result_add);
        System.out.println(result1_add);
        
        
    }
    
}
