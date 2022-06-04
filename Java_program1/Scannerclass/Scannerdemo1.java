/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scannerclass;
import java.util.Scanner;
import java.util.*;

public class Scannerdemo1 {
  public   void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id of employee ");
        int id = sc.nextInt();
        
        System.out.println("Enter name of the Employee ");
        String name = sc.next();
        
        System.out.println("Enter Salary of the Employee ");
        double salary = sc.nextDouble();
        
        System.out.println("id of employee: " + id);
        System.out.println("name of the employee: " + name);
        System.out.println("salary of the employee " + salary);
    }
    
}
