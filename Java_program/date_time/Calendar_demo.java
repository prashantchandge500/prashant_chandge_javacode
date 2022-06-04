/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package date_time;
import java.time.Month;
import java.util.*;
public class Calendar_demo {
    public static void main(String[] args) {
        Date date= new Date(99999999L);
        System.out.println("Dayeis is:"+ date);
        
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date);
        
        System.out.println("calendar 1 month: "+ cal1.get(Calendar.MONTH));
        System.out.println("calendar 1 year: "+ cal1.get(Calendar.YEAR));
        System.out.println("calendar 2 month: "+ cal2.get(Calendar.MONTH));
        System.out.println("calendar 2 year: "+cal2.get(Calendar.YEAR));
        
        cal1.add(Calendar.MONTH, 20);
        date = cal1.getTime();
        System.out.println("ourn date is "+ date);
        
        cal2.roll(Calendar.MONTH, -15);
        date=cal2.getTime();
        System.out.println("our date is:"+date);
        
        
        
        
    }
    
}
