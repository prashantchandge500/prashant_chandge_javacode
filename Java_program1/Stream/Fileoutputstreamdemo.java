/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stream;
import java.io.*;
public class Fileoutputstreamdemo {
    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("D:\\testdemo.txt");
            String s = "Welcome in deogiri institute of engineering and management studies";
            byte b[] = s.getBytes();
            f.write(b);
            f.close();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
