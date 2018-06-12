package ServiceStudent;

import DomenObject.Student;

import java.util.ArrayList;

public class CreateStudents {
    ArrayList<Student> studentsArrayList = new ArrayList<Student>();

    public CreateStudents() {
        Student people = new Student("FIO");
        Student people1 = new Student("FIO1");
        Student people2 = new Student("FIO2");
        Student people3 = new Student("FIO3");
        Student people4 = new Student("FIO4");
        Student people5 = new Student("FIO5");
        Student people6 = new Student("FIO6");
        Student people7 = new Student("FIO7");
        Student people8 = new Student("FIO8");
        Student people9 = new Student("FIO9");
        studentsArrayList.add(people);
        studentsArrayList.add(people1);
        studentsArrayList.add(people2);
        studentsArrayList.add(people3);
        studentsArrayList.add(people4);
        studentsArrayList.add(people5);
        studentsArrayList.add(people6);
        studentsArrayList.add(people7);
        studentsArrayList.add(people8);
        studentsArrayList.add(people9);
    }

    public ArrayList<Student> getStudentsArrayList() {
        return studentsArrayList;
    }

    public static void main(String[] args) {
        CreateStudents createPeople = new CreateStudents();
        ArrayList<Student>  students = createPeople.getStudentsArrayList();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}