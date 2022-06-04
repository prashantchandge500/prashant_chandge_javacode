/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stream;
import java .io.*;
public class Fileinputstreamdemo {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("D:\\testdemo.txt");
            String s = "data in the file";
            System.out.println(s);
            int i = f.read();
            System.out.println(i);
            while(i!=-1){
                System.out.print((char)i);
                i =f.read();
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
