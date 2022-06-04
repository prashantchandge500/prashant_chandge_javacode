/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrentpattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;

public class Newfixedthreadpooldemo {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(7);
        ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;
        System.out.println("Largest Execution " + pool.getLargestPoolSize());
        System.out.println("Maximum  allowed EXecution " + pool.getMaximumPoolSize());
        System.out.println(" current thread in the pool " + pool.getPoolSize());
        System.out.println(" curent active thread " + pool.getActiveCount());
        System.out.println(" Total number of thread " + pool.getTaskCount());

        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());

        System.out.println(" core thread: " + pool.getCorePoolSize());
        System.out.println("Largest Exxecution of the thread: " + pool.getLargestPoolSize());
        System.out.println("MAximum allowed Execution: " + pool.getMaximumPoolSize());
        System.out.println("current thread in the pool: " + pool.getPoolSize());
        System.out.println("Current active EXcution thread: " + pool.getActiveCount());
        executor.shutdown();

    }

    static class Task implements Runnable {

        public void run() {
            try {
                Long duration = (long) (Math.random() * 10);
                System.out.println("running task! thread name: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(duration);
                System.out.println("Completed task ! thread name: " + Thread.currentThread().getName());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
