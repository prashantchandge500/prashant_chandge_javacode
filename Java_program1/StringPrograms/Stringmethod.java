/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringPrograms;

/**
 *
 * @author hp
 */
public class Stringmethod {
    String str = "hello";
    
    String str2 ="world";
    
    public void display(){
        System.out.println("characyer at string: " + str.charAt(0));
        System.out.println("lenght of the string: "+ str.length());
        System.out.println("upper case of the str: " + str.toUpperCase());
        System.out.println("lowercase of the str: " + str.toLowerCase());
        System.out.println("Start with of the str: " + str.endsWith("llo"));
        System.out.println("end with th of the str: " + str.startsWith("hi"));
        System.out.println("replace of the str: "+ str.replace("h", "f"));
        System.out.println("repalce all  of the with: " + str.replaceAll("hello", "bye"));
        System.out.println("concat: " + str.concat(str2));
        System.out.println("index of teh str: "+ str.indexOf("l"));
        System.out.println("trim of the str: " + str.trim());
    }
    public static void main(String[] args) {
       Stringmethod s = new Stringmethod();
       s.display();
               
    }
    
}
