/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date_time;
import java.util.Date;
public class Date_demo {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date(142);
        
        System.out.println("First date is: " + date1);
        System.out.println("Second date is: " + date2);
        System.out.println("Third date is: " + date3);
        
        if(date1.after(date2)){
            System.out.println("date 1 is after the date2");
        }
        if(date2.before(date3)){
            System.out.println("date 2 is before date3");
        }
        date2.setTime(date2.getTime()+455214564454l);
        System.out.println("upadated date2 is: "+ date2);
        
        if(date2.before(date3)){
            System.out.println(" date2 is before date3");
        }
        else{
            System.out.println("date2 is after date3");
        }
        
    }
    
}
