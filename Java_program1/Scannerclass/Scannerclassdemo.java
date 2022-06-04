/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scannerclass;
import java.util.Scanner;
import java.io.*;

class Employee{
    int id;
    int age;
    String name;
    String post;
    String address;
    double salary;
    
    public Employee(int id, int age,String name, String post, String address,double salary){
        this.id = id;
        this.age = age;
        this.name = name;
        this.post = post;
        this.address = address;
        this.salary = salary;
    }
    
    public void display(){
        System.out.println("");
        System.out.println("Id of Employee: " + this.id );
        System.out.println("Age of Employee: " + this.age);
        System.out.println("Name of Employee: " + this.name);
        System.out.println("Post of employee: " + this.post);
        System.out.println("Address of employee: " + this.address);
        System.out.println("Salary of Employee: " + this.salary);
    }
    
}


public class Scannerclassdemo {
    public static  void main(String[] args)throws IOException{
        Scanner isr = new Scanner(System.in);
        
        
        System.out.println("Enter the id of employee: ");
        int id = isr.nextInt();
        
        System.out.println("Enter the age of the employee: ");
        int age = Integer.parseInt(isr.nextLine());
        
        System.out.println("Enter the name of  employee: ");
        String name = isr.nextLine();
        
        System.out.println("Enter the post of employee: ");
        String post = isr.nextLine();
        
        System.out.println("Enter the address of employee: ");
        String address = isr.nextLine();
        
        System.out.println("Enter the Salary of employee: ");
        double salary = Double.parseDouble(isr.nextLine());
        
        Employee emp = new Employee(id, age, name , post, address, salary);
        emp.display();
        
                
}
}

