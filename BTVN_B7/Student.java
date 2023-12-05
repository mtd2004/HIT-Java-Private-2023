package BTVN_B7;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private int age;
    private String grade;
    private List<Course> listCourse;

    public Student(int age, String grade, String id, String name) {
        super(id, name);
        this.age = age;
        this.grade = grade;
        this.listCourse = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public List<Course> getListCourse() {
        return listCourse;
    }

    public void setListCourse(List<Course> listCourse) {
        this.listCourse = listCourse;
    }

    public void enroll(Course course) {
        listCourse.add(course);
    }

    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Courses enrolled: ");
        for (Course course : listCourse) {
            course.displayInfo();
        }
    }
}
