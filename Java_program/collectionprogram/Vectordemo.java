/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionprogram;

import java.util.*;

/**
 *
 * @author hp
 */
public class Vectordemo {
    public static void main(String[] args) {
        Vector <String> list = new Vector<>();
        list.add("prashant");
        list.add("vishal");
        list.add("diapk");
        list.add("hello");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        Iterator itr1 = list.iterator();
        while (itr1.hasNext()) {
            System.out.println("After clearing");
            //System.out.println(itr1.next());
            list.clear();
        }

    }
    
}
