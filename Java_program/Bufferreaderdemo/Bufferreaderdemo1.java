
package Bufferreaderdemo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

public class Bufferreaderdemo1 {
    public static  void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Enter the id of employee: ");
        int id = Integer.parseInt(br.readLine());
        
        System.out.println("Enter the age of the employee: ");
        int age = Integer.parseInt(br.readLine());
        
        System.out.println("Enter the name of  employee: ");
        String name = br.readLine();
        
        System.out.println("Enter the post of employee: ");
        String post = br.readLine();
        
        System.out.println("Enter the address of employee: ");
        String address = br.readLine();
        
        System.out.println("Enter the Salary of employee: ");
        double salary = Double.parseDouble(br.readLine());
        
        Employee emp = new Employee(id, age, name , post, address, salary);
        emp.display();
        
                
    }
}
