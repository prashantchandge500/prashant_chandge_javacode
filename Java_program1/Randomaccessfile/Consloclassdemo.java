/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Randomaccessfile;
import java.io.Console;
public class Consloclassdemo {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("enter th username");
        String username = c.readLine();
        System.out.println("emter the password");
        char[] ch = c.readPassword();
        //String pass = String valueOf(ch);
        System.out.println("password is:" + pass);
        System.out.println("userame is: "+ username);
        
        
    }
    
}
