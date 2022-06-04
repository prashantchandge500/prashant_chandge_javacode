/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author hp
 */
public class Student implements java.io.Serializable{
    String f_name ;
    String l_name ;
    String Add;
    long M_n;
    double per;
    
    public void show(){
        System.out.println("Student detailes "+f_name +" "+l_name+" "+Add+" "+ M_n+" "+ per);
    }
    
}
