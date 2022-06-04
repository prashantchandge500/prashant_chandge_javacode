/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author hp
 */
public class Deserializationstudent {
    public static void main(String[] args) {
        Student s = null;
        try {
            FileInputStream filein = new FileInputStream("E://Student.ser");
            ObjectInputStream in = new ObjectInputStream(filein);
            s = (Student) in.readObject();
            in.close();
            filein.close();
            System.out.println("deserialization");
        } catch (IOException i) {
            i.printStackTrace();
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }
        
        System.out.println("Student First Name: " + s.f_name);
        System.out.println("Student Last Name: " + s.l_name);
        System.out.println("Student Address: " + s.Add);
        System.out.println("Student MObile Number: " + s.M_n);
        System.out.println("Sudent PErcentage: "+s.per);
    }
    
}
