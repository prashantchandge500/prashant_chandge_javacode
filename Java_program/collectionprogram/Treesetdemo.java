/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionprogram;

/**
 *
 * @author hp
 */
import java.util.*;
public class Treesetdemo {
    public static void main(String[] args) {
        TreeSet<String> tr = new TreeSet<>();
        tr.add("Akrur");
        tr.add("");
        tr.add("rushi");
        tr.add("dipak");
        tr.add("Dipak");
        tr.add("umakant");
        tr.add("prashant");
        
        Iterator<String> itr = tr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        System.out.print(tr);
        
        
    }
    
}
