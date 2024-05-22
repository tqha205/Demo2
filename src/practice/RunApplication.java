package practice;

import java.util.*;

public class RunApplication {
    static List<Student> listStudent;

    public static void main(String[] args) {
//        creatsStudent();
//       getStudent(1l);
//        showAllStudentList();
//       getFindIdByFistLetterOfEmail('h');
        listStudent = new ArrayList<>();
        creatsStudent(1, "Ha 1", "ha1#gmail.com", new Date());
        creatsStudent(2, "Ha 2", "ha2#gmail.com", new Date());
        creatsStudent(2, "Ha 3", "ha3#gmail.com", new Date());
        selectionSortById();


    }




    private static void selectionSortById() {
        int n = listStudent.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (listStudent.get(j).getId() < listStudent.get(minIndex).getId()) {
                    minIndex = j;
                }
                Student temp = listStudent.get(minIndex);
                listStudent.set(minIndex, listStudent.get(i));
                listStudent.set(i, temp);
            }
        }
        for (Student student : listStudent) {
            System.out.println(student);
        }

    }



    public static void getFindIdByFistLetterOfEmail(char fistletter) {

        System.out.println(" the first letter = " + fistletter);
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getEmail().charAt(0) == fistletter) {
                System.out.println(listStudent.get(i).toString());
//                return;

            }

        }

    }

    private static boolean getStudentById(long id) {
        System.out.println("Student with id = " + id);
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    private static void showAllStudentList() {
        System.out.println("List student is: ");
        System.out.println(Arrays.asList(listStudent));
    }

    private static void creatsStudent(long id, String name, String email, Date birthDay) {
        Student student = new Student(id, name, email, birthDay);
        if (!getStudentById(student.getId())){
            listStudent.add(student);
        }
    }
    
    private static Student creatsStudent() {
        listStudent = new ArrayList<>();
        Student student = new Student();
        if (!getStudentById(student.getId())){
            listStudent.add(student);
        }
        student.setId(1);
        student.setName("ha");
        student.setEmail("tph@gmail.com");
        student.setAddress("Ninh Binh");
//       System.out.println(student.toString());


        System.out.println(student);
//        List<Student> lstStudent;

        Student student1 = new Student(2, "Ha 2", "ha2#gmail.com", new Date()); ;
        Student student3 = new Student(4, "Cda", "hbc123@gamil.com", new Date());
        Student student2 = new Student(3, "Ha3", "ta3#gmail.com", new Date());
        listStudent.add(student1);
        listStudent.add(student3);
        listStudent.add(new Student(student1.getId(), student1.getName(), student1.getEmail(), student1.getBirthDay()));

        listStudent.add(student2);

//        student1.setName("Ta Quang Ha");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
//
        System.out.println("---------------------------------------------------------------------");
//        System.out.println(Arrays.asList(listStudent));
        System.out.println("Create student success!!!");
        return student;
    }

}

