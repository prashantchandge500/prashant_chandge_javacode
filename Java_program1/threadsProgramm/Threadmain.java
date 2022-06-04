/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadsProgramm;

/**
 *
 * @author hp
 */
public class Threadmain {
    public static void main(String[] args) {
        Thread1 t1  = new Thread1("thread1 is running .....");
        Thread2 t2  = new Thread2("thread2 is running....");
        t1.start();
        t2.start();
        
    }
    
}
