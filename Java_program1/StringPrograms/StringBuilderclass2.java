/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringPrograms;

/**
 *
 * @author hp
 */
public class StringBuilderclass2 {
    void show(){
        StringBuilder str = new StringBuilder("My Name is ");
        str.append("Prashant Rameshwar Chandge");
        str.insert(str.length()," i am from Aurangabad");
        str.append(" currently i am Pursuing my B-tech degree from DIEMS Aurangabad. ");
        str.insert(str.length()," My 6th sem CGPA is 8.40 ");
        str.replace(143, 148, "9.50");
        str.deleteCharAt(2);
        str.delete(0, 2);
        System.out.println(str.capacity());
        System.out.println("STR:" + str.length());
        System.out.println("STR : " + str.toString());
        
    }
    
}
