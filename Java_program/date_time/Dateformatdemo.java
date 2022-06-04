/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date_time;

import java.util.*;
import java.text.DateFormat;
import jdk.jfr.DataAmount;

public class Dateformatdemo {

    public static void main(String[] args) {
        DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT);
        System.out.println(dateformat.format(new Date()));

        dateformat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dateformat.format(new Date()));

        dateformat = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(dateformat.format(new Date()));

        dateformat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(dateformat.format(new Date()));

    }

}
