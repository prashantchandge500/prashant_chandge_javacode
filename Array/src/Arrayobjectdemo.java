class Student{
    int rollno;
    String name;
    int age;
    String Address;
    
    public Student(int rollno,String name,int age,String address){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
        this.Address=address;
        
    }
}
public class Arrayobjectdemo {
    public static void main(String[] args) {
        Student student[];
        student =new Student[3];
        student[0]= new Student(1,"Prashnt chandge",21,"Aurangabad");
        student[1]= new Student(2,"Dipak lodwakl",22,"Jalna");
        student[2]= new Student(3,"Umalant kathar",23,"Aurangabad");
        
        for(int i=0;i<student.length;i++){
            System.out.println("element at index : "+ i +" : "+  student[i].rollno+" " + student[i].name+" "+student[i].age+" " +student[i].Address);
           
        }
        
    }
    
}
