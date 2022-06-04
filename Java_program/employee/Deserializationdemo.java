/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializationdemo {

    public static void main(String[] args) {
        Employee e = null;
        try {
            FileInputStream filein = new FileInputStream("E://Employee.ser");
            ObjectInputStream in = new ObjectInputStream(filein);
            e = (Employee) in.readObject();
            in.close();
            filein.close();
            System.out.println("deserialization Successfully compiled");
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
            return;
        }
        System.out.println("employee name: " + e.name);
        System.out.println("Employee Address:" + e.Address);
        System.out.println("Employee id: " + e.id);
        System.out.println("Employee age: " + e.age);
    }

}
