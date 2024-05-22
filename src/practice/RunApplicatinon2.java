package practice;

import java.util.*;

public class RunApplicatinon2 {

    public static void main(String[] args) {

        List<Student2> students = new ArrayList<>();
        students.add(new Student2(" quang ha", new Date(), 10.0));
        students.add(new Student2(" quang hop", new Date(), 10.0));

        students.add(new Student2(" ngoc minh", new Date(), 9.0));
        students.add(new Student2(" anh quan", new Date(), 5.5));
        //tim sinh vien theo ten
        String searchName = " quang ";
        List<Student2> studentsWithName = findByName(students, searchName);
        System.out.println("Student with name containing :" + searchName + "\n " + studentsWithName);
        String searchName1 = " minh";
        List<Student2> studentsWithName1 = findByName(students, searchName1);
        System.out.println("Student with name containing :" + searchName1 + "\n " + studentsWithName1);
        String searchName2 = "anh";
        List<Student2> studentsWithName2 = findByName(students, searchName2);
        System.out.println("Student with name containing :" + searchName2 + "\n " + studentsWithName2);

//     tim sinh vien theo tuoi
        Date targetAge = new Date();
        List<Student2> studentWithAge = findByAge(students, targetAge);
        System.out.println("\n student with age :" + targetAge + " :");
        System.out.println(studentWithAge);
//        tim sinh vien theo diem trung binh
        double targetGpa = 10.0;
        List<Student2> studentWithGpa = findByGpa(students, targetGpa);
        System.out.println("\n student with gpa :" + targetGpa + " :");
        System.out.println(studentWithGpa);
    }

    public static List<Student2> findByName(List<Student2> students, String name) {
        List<Student2> result = new ArrayList<>();
        for (Student2 student : students) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(student);
            }
        }
        return result;
    }

    public static List<Student2> findByAge(List<Student2> students, Date age) {
        List<Student2> result = new ArrayList<>();
        for (Student2 student : students) {
            if (Objects.equals(student.getAge(), new Date())) {
                result.add(student);
            }
        }
        return result;
    }

    public static List<Student2> findByGpa(List<Student2> students, double gpa) {
        List<Student2> result = new ArrayList<>();
        for (Student2 student : students) {
            if (student.getGpa() >= gpa) {
                result.add(student);
            }
        }
        return result;
    }
}


