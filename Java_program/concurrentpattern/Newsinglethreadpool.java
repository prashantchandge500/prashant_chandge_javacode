/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrentpattern;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;

class Task implements Runnable{
    public void run(){
        try {
            Long duration = (long)(Math.random()*20);
            System.out.println("Running Task!");
            TimeUnit.SECONDS.sleep(duration);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Newsinglethreadpool {
    public static void main(String[] args)throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try {
            executor.submit(new Task());
            System.out.println("shutdown executor");
            executor.shutdown();
            executor.awaitTermination(10, TimeUnit.SECONDS);
            
        } catch (InterruptedException e) {
            System.out.println("tasks interrupted");
        } finally {
            if(!executor.isTerminated()){
                System.out.println("cancel");
            }
            executor.shutdown();
            System.out.println("shutdown is finished");
            
        }
        
    }
    
}
