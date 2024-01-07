package BTVN_B9.Bai1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>() ;
        StudentManagement studentManagement = new StudentManagement(studentList,"students.txt", "grades.txt");

        Student student1 = new Student("Mai Tất Duy", 8.0);
        Student student2 = new Student("Jessica", 9.5);
        Student student3 = new Student("Zuka", 9.0);
        Student student4 = new Student("Florentino", 9.5);
        Student student5 = new Student("Nakroth", 10.0);

        studentManagement.addStudent(student1);
        studentManagement.addStudent(student2);
        studentManagement.addStudent(student3);
        studentManagement.addStudent(student4);
        studentManagement.addStudent(student5);

        // Lưu trữ thông tin sinh viên vào file
        studentManagement.saveStudentsToFile();

        // Cập nhật điểm số của sinh viên
        studentManagement.updateGrade("Elsu", 9.9);

        // Lưu trữ điểm số vào file
        studentManagement.saveGradesToFile();

        // Đọc thông tin sinh viên từ file
        studentManagement.loadStudentsFromFile();

        // Đọc điểm số từ file
        studentManagement.loadGradesFromFile();
    }

}
