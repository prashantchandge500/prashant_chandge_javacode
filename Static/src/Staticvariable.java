class Student{
    int rollNO;
    String Name;
    static String collagename = "DIEMS";
    
    public Student(int rollno, String name){
        this.rollNO = rollno;
        this.Name = name;
    }
    void Display(){
        System.out.println(rollNO +" "+Name+" "+collagename);
    }
      
}
public class Staticvariable {
    public static void main(String[] args) {
        Student s1 = new Student(01,"Prashant chandge");
        Student s2 = new Student(02, "Dipk Lodwal");
        Student s3 = new Student(03, "Umakant Kathar");
        
       s1.Display();
       s2.Display();
       s3.Display();
    }
    
}
