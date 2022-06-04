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
public class Linkedhashsetdemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(20);
        lhs.add(0);
        lhs.add(40);
       lhs.add(0);
        lhs.add(50);

        Iterator<Integer> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        
        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
        lhs1.addAll(lhs);
        lhs1.add(15);
        lhs1.add(52);
        lhs1.add(85);
        lhs1.add(45);
        System.out.println(lhs1);

        boolean value1 = lhs1.remove(52);
        System.out.println("IS 52 REmoved " + value1);
        System.out.println(lhs1);
    } 
}
