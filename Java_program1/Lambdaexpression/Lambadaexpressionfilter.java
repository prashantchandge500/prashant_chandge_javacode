/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambdaexpression;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

class Prodct {

    int id;
    String name;
    Float Price;

    public Prodct(int id, String name, Float price) {
        this.id = id;
        this.name = name;
        this.Price = price;

    }
}

public class Lambadaexpressionfilter {

    public static void main(String[] args) {
        List<Prodct> list = new ArrayList<>();
        list.add(new Prodct(1, "Dell laptop", 150000f));
        list.add(new Prodct(2, "Apple phone", 50000f));
        list.add(new Prodct(3, "Samsung", 4000f));
        list.add(new Prodct(4, "MI", 11000f));
        list.add(new Prodct(5, "REalME", 6000f));

        Stream<Prodct> filterdata = list.stream().filter(p -> p.Price >= 10000f);
        filterdata.forEach(product -> System.out.println(product.id + " " + product.name + " " + product.Price));

    }

}
