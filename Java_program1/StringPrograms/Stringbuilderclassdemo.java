
package StringPrograms;
public class Stringbuilderclassdemo {
    void show(){
        StringBuilder str = new StringBuilder();
        System.out.println(str.capacity());
        str.append("Fuel,pune");
        str.insert(9 ," maharashtra");
        str.append(" hello java");
        str.replace(2, 6, "HELLO");
        str.deleteCharAt(0);
        str.delete(4, 9);
        System.out.println("String " + str.toString());
        
        StringBuilder str1 = new StringBuilder("welcome to in deogiri collag auranagabad");
        System.out.println(str1.length());
        System.out.println(str1.capacity());
        System.out.println("string1 " + str1.toString());
        
        StringBuilder str2 = new StringBuilder(10);
        System.out.println("String2 capacity " + str2.capacity());
        
        StringBuilder str3 = new StringBuilder(str1.toString());
        System.out.println("strting3 " + str3.toString());
        
    }
    
}
