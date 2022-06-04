/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enumprogram;

/**
 *
 * @author hp
 */
public class Enumdemo1 {

    enum Season {
        WINTER(5), SPRING(10), SUMMER(15), FALL(20);

        private int value;

        private Season(int value) {
            this.value = value;
        }
    }

    public static void main(String args[]) {
        for (Season s : Season.values()) {
            System.out.println(s + " " + s.value);
        }

    }

}
