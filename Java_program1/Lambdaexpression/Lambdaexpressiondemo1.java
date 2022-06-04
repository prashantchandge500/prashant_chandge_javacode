/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambdaexpression;

interface Sayable {

    public String Say(String Name, String working);
}

public class Lambdaexpressiondemo1 {

    public static void main(String[] args) {
        Sayable s1 = (Name, working) -> {
            return "Hello " + Name + ".it is working " + working + " firm ";
        };
        System.out.println(s1.Say("Prashant", "DIEMS"));

        Sayable s2 = (Name, working) -> {
            return "hello " + Name + ".it is working " + working + " firm ";
        };
        System.out.println(s2.Say("Dipak", "MIT"));

    }

}
