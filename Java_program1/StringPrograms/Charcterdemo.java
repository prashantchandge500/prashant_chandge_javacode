/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringPrograms;

/**
 *
 * @author hp
 */
public class Charcterdemo {
    void display(){
        String str ="welcome in the deogiri collage";
        System.out.println(str.charAt(5));
        
        for(int i=1;i<str.length()-1;i++){
            if(i%2!=0){
                System.out.println("Char at " + i + " : " + str.charAt(i));
            }
        }
    }
    
}
