package Lesson08_02_2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Students {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван", "Иванов", 1));
        students.add(new Student("Иван", "Алексеев", 1));
        students.add(new Student("John", "Doe", 2));
        students.add(new Student("Jane", "Smith", 1));

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student.toString());
        }
        Student student1 = new Student("Иван", "Иванов", 1);
        Student student2 = new Student("Иван", "Алексеев", 1);
        System.out.println(student1.compareTo(student2));

        Comparator<Student> compName = Comparator.comparing(obj -> obj.getName());
        Comparator<Student> compGrade = Comparator.comparing(obj -> obj.getGrade());
        Comparator<Student> compNameSurname = Comparator.comparing((Student s) -> s.getName())
                .thenComparing(s -> s.getSurname());


        Collections.sort(students, new CompSurname());
        for (Student student : students) {
            System.out.println(student.toString());
        }

    }
}

class Student implements Comparable<Student> {
    private String name;
    private String surname;


    private int grade;

    public Student(String name, String surname, int grade) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.surname.compareTo(this.surname);
    }
}

class CompSurname implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getSurname().compareTo(s2.getSurname());
    }
}
