/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.excepation;
import java.util.*;
import java.io.*;
public class Throwsexcepation {
    void testmethod(int num) throws IOException, ArithmeticException{
        if(num==1){
            throw new IOException("IO EXCEPATION");
        }
        else{
            throw new ArithmeticException("ARTHMATIC EXCEPATION");
        }
        
        
    }
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int num = sc.nextInt();
        
        Throwsexcepation th = new Throwsexcepation();
        th.testmethod(num);
    } catch (Exception e){
            System.out.println(e.getMessage());
    }
    }}
   

