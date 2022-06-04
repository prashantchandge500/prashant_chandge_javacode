/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seri_Deseri_inheritance;
import java.util.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author hp
 */
public class Serializationproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enteri the first name:");
      String f_name = sc.next();
        System.out.println("enter the comapny name");
        String company_name = sc.next();
        System.out.println("enter the department name");
        String Department_name = sc.next();
        System.out.println("enter the project name");
        String project_name = sc.next();
        Project p = new Project();
        p.show3();       
        try {
            
            FileOutputStream fileout = new FileOutputStream("E://Project.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(p);
            out.close();
            fileout.close();
            System.out.println("serialization compiled");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    
}
