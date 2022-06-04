/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loopsprogram;

/**
 *
 * @author hp
 */
import java.io.*;
import java.util.Scanner;
public class Trianglestar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterv an number");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        
    }
    
    
}
