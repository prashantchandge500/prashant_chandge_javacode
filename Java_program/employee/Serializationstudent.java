/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author hp
 */
public class Serializationstudent {

    public static void main(String[] args) {
        Student s = new Student();
        s.f_name = "prashant";
        s.l_name = "chandge";
        s.Add = "Auranagabad maharashtara";
        s.M_n = 9146956239L;
        s.per = 88.80;

        try {
            FileOutputStream fileout = new FileOutputStream("E:Student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(s);
            out.close();
            fileout.close();
            System.out.println("serialization Student successfully compile");

        } catch (IOException i) {
            i.printStackTrace();
        }

    }

}
