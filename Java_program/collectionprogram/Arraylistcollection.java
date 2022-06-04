
package collectionprogram;

import java.util.*;

public class Arraylistcollection {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("prashant");
        list.add("vishal");
        list.add("diapk");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
