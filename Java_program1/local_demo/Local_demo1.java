/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local_demo;

import java.util.Locale;

public class Local_demo1 {

    public static void main(String[] args) {
        Locale[] alllocal = Locale.getAvailableLocales();
        int i = 1;
        for (Locale local : alllocal) {
            i++;

            System.out.println("country: " + local.getDisplayCountry());
            System.out.println("Language:" + local.getDisplayLanguage());

            if (i > 11) {
                break;
            }

        }
    }
}
