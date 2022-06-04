/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrentpattern;

import java.util.concurrent.*;
import java.io.*;
import java.util.*;

public class Newscheduledthreadpool {

    public static void main(String[] args) {
        System.out.println("countdown the program that count from 0 to 10");

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(10);
        System.out.println("current time: " + Calendar.getInstance().get(Calendar.SECOND));
        for (int i = 10; i >0; i--) {
            scheduler.schedule(new Task(i), 10 - i, TimeUnit.SECONDS);

        }
        scheduler.shutdown();

    }

}
class Task implements Runnable{
    private int num;
    public Task(int num){
        this.num=num;
    }
    @Override
    public void run(){
        System.out.println("Number "+ num + " current time: " + Calendar.getInstance().get(Calendar.SECOND));
    }
}
