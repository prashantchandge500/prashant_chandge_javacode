/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadsProgramm;

/**
 *
 * @author hp
 */
public class Thread1 extends Thread{
    String msg = "";
    public Thread1(String msg){
        this.msg = msg;
    }
    public void run(){
        try {
            while(true){
                System.out.println(msg);
                Thread.sleep(300);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
  
    
    
}
