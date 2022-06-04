package collectionprogram;

import java.util.*;

public class Linkedlistdemo {

    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("hello");
        l.add("PRashant");
        l.add("and dipak");
        l.add("in mumbai");

        Iterator<String> itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
