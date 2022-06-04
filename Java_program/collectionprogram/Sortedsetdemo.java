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
public class Sortedsetdemo {
    public static void main(String[] args) {
        SortedSet<String> st = new TreeSet<>();
        st.add("vishal");
        st.add("shubham");
        st.add("dipak");
        st.add("");
        
        Iterator<String> itr = st.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
