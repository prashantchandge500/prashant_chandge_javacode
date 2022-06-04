package employee;

public class Employee implements java.io.Serializable {

    String name;
    String Address;
    int id;
    int age;

    public void show() {
        System.out.println("Employee Details " + name + " " + Address + " " + id + " " + age);
    }

}
