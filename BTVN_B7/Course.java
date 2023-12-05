package BTVN_B7;

import java.util.ArrayList;
import java.util.List;

public class Course implements Displayable {
    private String courseID ;
    private String courseName ;
    private List<Student> listStudent ;
    
    public Course(String courseID , String courseName) {
        this.courseID = courseID ;
        this.courseName = courseName ;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Course Information:");
        System.out.println("Course ID: " + getCourseID());
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Students enrolled: ");
        for (Student student : listStudent) {
            student.displayInfo();
        }
        System.out.println();
    }
    
    
}
