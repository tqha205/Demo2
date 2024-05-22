package practice;

import java.util.Date;

public class Student2 {
    private String name;
    private Date age;
    private double gpa;
//
//    public Student2() {
//
//    }

    public Student2( String name, Date age, double gpa) {

        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
//    public  Student2 (String name, int age, double gpa){
//
//    }
//

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public Date getAge() {
        return age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public String toString() {
        return "Student{" +
                ", name='" + name + '\'' +
                ",age'" + age + '\'' +
                ",gpa'" + gpa + '\'' +
                '}';
    }


}
