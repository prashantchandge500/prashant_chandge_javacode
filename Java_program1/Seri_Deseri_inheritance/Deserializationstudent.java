/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seri_Deseri_inheritance;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializationstudent {
    public static void main(String[] args) {
        Project p =null;
        try {
            FileInputStream filein = new FileInputStream("E//Project.ser");
            ObjectInputStream in = new ObjectInputStream(filein);
            p =(Project) in.readObject();
            in.close();
            filein.close();
            System.out.println("Deserialization complied");
            
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c){
            c.printStackTrace();
        }
    }
   
}
