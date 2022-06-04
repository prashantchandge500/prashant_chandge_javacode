/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadsProgramm;

/**
 *
 * @author hp
 */
 class Multithreading implements Runnable{
    public void run(){
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("EXcepation is cought");
        }
    }
    
    
}
 public  class MUltithreadingdemo {
     public static void main(String[] args) {
         for(int i =0; i<8 ; i++){
             Thread object = new  Thread(new Multithreading());
             object.start();
             
             
         }
     }
             
            
    
}

