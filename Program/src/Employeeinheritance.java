class employee{
    int salary =40000;
    
}
class sameemployee extends employee{
    int bonus=1500;
    int total;
    
    void show(){
        total=bonus+salary;
        System.out.println("Total salary of employee "+ total);
        System.out.println("Salary of employee "+ salary);
        
    }           
}
public class Employeeinheritance{
    public static void main(String[] args) {
        sameemployee s1 = new sameemployee();
        s1.show();
    }
}



