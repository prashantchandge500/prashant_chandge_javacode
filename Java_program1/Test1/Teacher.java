package Test1;

public class Teacher extends Person {

    double Salary;
    int year_work;
    int Experiance;

    public Teacher(String F_name, String L_name, double salary, int year_work, int Experiance) {
        super(F_name, L_name);
        this.Salary = salary;
        this.year_work = year_work;
        this.Experiance = Experiance;
    }

    public String getF_name() {
        return F_name;
    }

    public String getL_name() {
        return L_name;
    }

    public Double getSalary() {
        return Salary;
    }

    public Integer getYaer_work() {
        return year_work;
    }

    public Integer getExperiance() {
        return Experiance;

    }
}
