/*
. Create a class that captures students. Each student has a first name, last name, class year, and major. 
Declare these variables as private and provide getter and setter methods for these variables
Create two examples of students(means create 2 objects of Student class). 

NOTE : Do not take input from keyboard. Set the values by using setter method and to get values use getter method



 */
package Test1;

import java.io.*;

class Student {

    private String f_name;
    private String L_name;
    private int year;
    private String major;
    
    public void setName(String name) {
        this.f_name = name;
    }

    public String getName() {
        return f_name;
    }

    public void setLast_name(String name) {
        this.L_name = name;
    }

    public String getLast_name() {
        return L_name;
    }

    public void setYear(int a) {
        this.year = a;
    }

    public Integer getYear() {
        return year;
    }

    public void setMajor(String name) {
        this.major = name;
    }

    public String getMajor() {
        return major;
    }

    public void show() {
        System.out.println(f_name);
        System.out.println(L_name);
        System.out.println(year);
        System.out.println(major);
        
    }
    
}

class Program4 {

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("prashant");
        s.setLast_name("chandge");
        s.setYear(4);
        s.setMajor("mechanical Engineering");
        
        s.show();
        
    }
}
