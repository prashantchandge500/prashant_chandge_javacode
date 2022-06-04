/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadsProgramm;

public class Threadprioveratydemo extends Thread {

    public void run() {
        System.out.println("Run() method ");
        String threadName = Thread.currentThread().getName();
        Integer threadprio = Thread.currentThread().getPriority();
        System.out.println(threadName + " has Prioverty " + threadprio);

    }

    public static void main(String[] args) throws InterruptedException {

        Threadprioveratydemo t1 = new Threadprioveratydemo();
        Threadprioveratydemo t2 = new Threadprioveratydemo();
        Threadprioveratydemo t3 = new Threadprioveratydemo();

        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(MIN_PRIORITY);
        t3.setPriority(NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }

}
