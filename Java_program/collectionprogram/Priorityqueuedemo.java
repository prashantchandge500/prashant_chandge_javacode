
package collectionprogram;

import java.util.*;

public class Priorityqueuedemo {

    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("prashant chandge ");
        pq.add("Dipak lodwal");
        pq.add("umakant kathar");
        pq.add("Yash kothari");
        pq.add("sagar solunke");
        pq.add("Harshad marakad");
        System.out.println("Head:" + pq.element());
        System.out.println("Head:" + pq.peek());
        System.out.println("Itreating the Queue element:");

        Iterator itr = pq.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        pq.remove();
        
        pq.poll();
        System.out.println("After removing the element:");
        Iterator<String> itr1 = pq.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

    }

}
