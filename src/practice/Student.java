package practice;

import java.util.Date;
import java.util.List;

public class Student {
    private long id;
    private String name;
    private String email;
    private Date birthDay;
    private String address;

    public Student() {

    }

    public Student(long id, String name, String email, Date birthDay) {
//        if (getStudentById(id, lstStudent)) {
//            return;
//        }
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;

    }

    public Student(long id, String name, String email, String birthday, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
        this.address = address;


    }

    private boolean getStudentById(long id, List<Student> listStudent) {
        System.out.println("Student with id = " + id);
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                System.out.println(listStudent.get(i).toString());
                return true;
            }
        }
        return false;
    }

    public void setId(long id) {
        if (id < 0) {
            System.out.println("khong ton tai gia tri am.");
            return;
        }
        this.id = id;
    }

    public long getId() {
        return this.id;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }



    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDay=" + birthDay +
                ", address='" + address + '\'' +
                '}';

    }
}
