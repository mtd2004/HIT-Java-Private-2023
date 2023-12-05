package BTVN_B7;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students;
    private List<Course> courses;

    public University() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    
    
    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displayAllStudents() {
        System.out.println("Tat Ca Hoc Sinh Trong Truong");
        for (Student student : students) {
            student.displayInfo();
        }
    }

    public void displayAllCourses() {
        System.out.println("Tat Ca Khoa Hoc Trong Truong");
        for (Course course : courses) {
            course.displayInfo();
        }
    }

}
