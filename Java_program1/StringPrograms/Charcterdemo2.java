/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringPrograms;

/**
 *
 * @author hp
 */
public class Charcterdemo2 {
    void display(){
        String str = "hello prashant how are you . hello umakant how are you";
        System.out.println("Even charcter");
        for(int i=0;i<str.length()-1;i++){
            if(i%2==0){
                System.out.println("char at " + i + " : " + str.charAt(i));
            }
        }
        
        System.out.println("Odd chancter");
        for(int i=0;i<str.length()-1;i++){
        
            if(i%2!=0){
                System.out.println("char at " + i + " : " + str.charAt(i));
            }
            
        }
        System.out.println("lenght of string is " + str.length());
                
    }
    
}

