/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringPrograms;

/**
 *
 * @author hp
 */
public class StringBufferclassdemo {
    void show(){
        StringBuffer str = new StringBuffer();
        str.append("HEllo dipak ");
        str.insert(str.length(), " How are You");
        str.charAt(5);
        str.replace(0, 5, "Hi");
        System.out.println("String " + str.toString());
        
        StringBuffer str1 = new StringBuffer(" Hello Prashant ");
        str1.append("how ARE YOU");
        System.out.println("STR1 "+ str1.toString());
        
        StringBuffer str2 = new StringBuffer(20);
        System.out.println("str2 "+ str2.capacity());
        
        StringBuffer str3  =  new  StringBuffer(str.toString());
        System.out.println("str3 " + str3.toString());
        
        
        
                
        
        
    }
    
}
