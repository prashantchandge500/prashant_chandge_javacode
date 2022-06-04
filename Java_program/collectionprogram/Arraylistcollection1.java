package collectionprogram;

import java.util.*;
import java.io.*;

public class Arraylistcollection1 {

    public static void main(String[] args) {
        int i;
        ArrayList<Integer> al1 = new ArrayList<>();
        for (i = 1; i < 100; i++) {
            al1.add(i);


        }
        System.out.println("oddd number");

        for (i = 0; i < 50; i++) {
          //  if (i % 2 != 0) {
                al1.remove(i);
                System.out.println(al1);


            }
        }
            
        

    }

