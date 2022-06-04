
package Lambdaexpression;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Prodct {

    int id;
    String name;
    Float Price;
    int warranty;

    public Prodct(int id, String name, Float price, int warranty) {
        this.id = id;
        this.name = name;
        this.Price = price;
        this.warranty = warranty;
    }
}

public class lambadaexpressioncompareto {

    public static void main(String[] args) {
        List<Prodct> list = new ArrayList<>();
        list.add(new Prodct(1, "Dell laptop", 150000f, 2));
        list.add(new Prodct(1, "Apple phone", 50000f, 3));
        list.add(new Prodct(1, "keyboard", 4000f, 1));

        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);

        });
        for (Prodct p : list) {
            System.out.println(p.id + " " + p.name + " " + p.Price + " " + p.warranty);

        }

    }

}
