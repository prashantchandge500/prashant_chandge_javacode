/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Seriliazationdemo {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Prashant chandge";
        e.Address = "Address";
        e.id = 19200763;
        e.age = 21;

        try {
            FileOutputStream fileout = new FileOutputStream("E://Employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(e);
            out.close();
            fileout.close();
            System.out.println("Serialization succeessfully complled");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

}
