class Student{
    int rollNO;
    String Name;
    static String collagename = "DIEMS";
    
    public Student(int rollno, String name){
        this.rollNO = rollno;
        this.Name = name;
    }
    static{
        System.out.println("block");
    }
    
   static void changnamecollage(){
       collagename = "JNEC";
   }
    
    void Display(){
        System.out.println(rollNO +" "+Name+" "+collagename);
    }
      
}
public class Staticvariabledemo1 {
    public static void main(String[] args) {
        Student.changnamecollage();
        Student s1 = new Student(01,"Prashant chandge");
        Student s2 = new Student(02, "Dipk Lodwal");
        Student s3 = new Student(03, "Umakant Kathar");
        Student s4 = new Student(04, "Vishal bade");
        
        System.out.println("**WElCOME TO THE HEAVAN**");
        
       s1.Display();
       s2.Display();
       s3.Display();
       s4.Display();
    }
}
