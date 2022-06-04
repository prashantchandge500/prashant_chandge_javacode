/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Number_format;

import java.text.*;
import java.util.*;

public class Currancydemo {

    public static void printcurrancy(Locale locale) {
        double d = 15.5;
        NumberFormat numberformat = NumberFormat.getCurrencyInstance(locale);
        String currancy = numberformat.format(d);
        System.out.println(currancy + " for the local " + locale);
    }
     static void printcurrancy1(){
         double e = 12.5;
         NumberFormat numberformat = NumberFormat.getCurrencyInstance(new Locale("en","IN")) ;
         String currancy = numberformat.format(e);
         System.out.println(currancy);
     }

    public static void main(String[] args) {
        printcurrancy(Locale.JAPANESE);
        printcurrancy(Locale.CHINA);
        printcurrancy(Locale.CANADA);
        printcurrancy(Locale.GERMAN);
        printcurrancy1();

    }

}
