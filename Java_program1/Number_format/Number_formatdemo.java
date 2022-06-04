/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Number_format;

import java.text.NumberFormat;
import static java.text.NumberFormat.*;

public class Number_formatdemo {

    public static void main(String[] args) {
        double d = 145555.2544;
        System.out.println("double is: " + d);

        NumberFormat nf = null;
        nf = NumberFormat.getInstance();
        System.out.println("format of number: " + nf.format(d));
        nf.setMaximumIntegerDigits(2);
        nf.setMaximumFractionDigits(2);
        System.out.println("formating number with max 2 digit and 2 Fraction: " + nf.format(d));

        nf.setMaximumIntegerDigits(3);
        nf.setMaximumFractionDigits(3);
        System.out.println("formating number with max  digit and 3 fraction: " + nf.format(d));

        nf = NumberFormat.getCurrencyInstance();
        System.out.println("formating number with currancy: " + nf.format(d));
    }

}
