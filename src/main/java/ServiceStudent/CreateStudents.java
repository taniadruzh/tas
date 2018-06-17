package ServiceStudent;

import DomenObject.Student;

import java.util.ArrayList;

public class CreateStudents {
    ArrayList<Student> studentsArrayList = new ArrayList<Student>();

    public CreateStudents() {
        Student people = new Student("FIO","SN1","m","123456");
        Student people1 = new Student("FIO1","SN2","f","56788");
        Student people2 = new Student("FIO2","SN3","m","98765");
        Student people3 = new Student("FIO3","SN4","m","89054");
        Student people4 = new Student("FIO4","SN5","f","65423");
        Student people5 = new Student("FIO5","SN6","m","12386");
        Student people6 = new Student("FIO6","SN7","f","54326");
        Student people7 = new Student("FIO7","SN8","m","43217");
        Student people8 = new Student("FIO8","SN9","f","34561");
        Student people9 = new Student("FIO9","SN10","f","78434");
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

    public ArrayList<Student> getStudentsArrayListBySex(String sex) {

        ArrayList <Student> studentsSexArrayList = new ArrayList<>();
           if (sex != null){
               for (int i = 0; i < studentsArrayList.size(); i++) {
                    Student student = studentsArrayList.get(i);
                    if (student.getSex().equals(sex))
                    {
                        studentsSexArrayList.add(student);
                    }
                }
           }
        return studentsSexArrayList;
    }

    public static void main(String[] args) {
        CreateStudents createPeople = new CreateStudents();
        ArrayList<Student>  students = createPeople.getStudentsArrayList();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}