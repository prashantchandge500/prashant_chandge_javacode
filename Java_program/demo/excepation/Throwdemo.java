package demo.excepation;

import java.util.*;

public class Throwdemo {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the age ");
        int age = scn.nextInt();
        if (age < 18) {
            throw new ArithmeticException("he/she is not eligible for voting");
        } else {
            System.out.println("He/she is Eligible for voting");
        }

    }
}
