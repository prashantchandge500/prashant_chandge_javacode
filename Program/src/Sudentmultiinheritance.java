class Student{
    int rollno ;
    String name;
    int age;
    
    public Student(int rollno,String name,int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("rollno of student is: "+ rollno);
        System.out.println("name of the student is: "+ name);
        System.out.println("age of the student is; "+age);
    }
}
class Subject extends Student{
    int s1,s2,s3,s4,s5;
    int total;
    public Subject(int rollno,String name,int age ,int s1,int s2,int s3,int s4,int s5){
        super(rollno,name,age);
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
        this.s4=s4;
        this.s5=s5;
    }
    public void show(){
        total=s1+s2+s3+s4+s5;
        System.out.println("total marks of the student "+total);
    }
}
class Result extends Subject{
    int perc;
    
    public Result(int rollno,String name,int age ,int s1,int s2,int s3,int s4,int s5,int perc){
        super(rollno,name,age,s1,s2,s3,s4,s5);
        this.perc=perc;
              
    }
    public void info(){
        perc=total/5;
        System.out.println("percentage of marks "+perc);
    }
}
public class Sudentmultiinheritance {
    public static void main(String[] args) {
        
        Result b=new Result(01,"chandge",21,85,52,89,56,45,45);
        b.display();
        b.show();
        b.info();
        
        
        
        
       
    }
}
