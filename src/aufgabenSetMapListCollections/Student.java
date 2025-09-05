package aufgabenSetMapListCollections;

import java.util.*;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }



    private List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student){
        students.add(student);
    }

    Student alex = new Student("Alex", 23, 4.5);
    Student bob = new Student("Bob", 23, 1.5);
    Student charlie = new Student("Charlie", 23, 2.5);
    Student dave = new Student("Dave", 23, 3.5);
    Student elli = new Student("Elli", 23, 3.0);

//    public TreeMap<Student, Object> namenSortieren(List<Student> students){
//        TreeMap<Integer, Object> sortedStudents = new TreeMap<>();
//
//        for(Student student : students){
//            sortedStudents.put(student.getAge(), student.getGrade());
//        }
//        return sortedStudents;
//    }
//
//    @Override
//    public static void main(String[] args){
//        System.out.println(Student.namenSortieren);
//    }

}
