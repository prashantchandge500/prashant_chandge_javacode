package collectionprogram;

import java.util.*;

public class Hashsetdemo {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Amol");
        hs.add("Amol");
        hs.add("prashant");
        hs.add("umakant");
        hs.add("Prashant");
        hs.add("");
        hs.add("");

        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        System.out.println(hs);
        HashSet<String> hs1 = new HashSet<>();
        hs1.addAll(hs);
        hs1.add("");
        hs1.add("8");
        hs1.add("4");
        hs1.add("2");
        System.out.println(hs1);

        boolean value1 = hs1.remove("4");
        System.out.println("IS 3 REmoved " + value1);
        System.out.println(hs1);

        boolean value2 = hs.removeAll(hs);
        System.out.println("is hs removed " + value2);
        System.out.println(hs);

    }

}
