package BTVN_B9.Bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private List<Student> students = new ArrayList<>();
    private String studentsFile;
    private String gradesFile;

    public StudentManagement(List<Student> students, String studentsFile, String gradesFile) {
        this.studentsFile = studentsFile;
        this.gradesFile = gradesFile;
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateGrade(String studentName, double newGrade) {
        try {
            for (Student student : students) {
                if (student.getName().equals(studentName)) {
                    student.setGrade(newGrade);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void saveStudentsToFile() {
        try {
            FileOutputStream fileOut = new FileOutputStream(studentsFile);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(students);
            objectOut.close();
            fileOut.close();
            System.out.println("Danh sách sinh viên đã được ghi vào file.");
        } catch (IOException e) {
            System.out.println("Lỗi: Không thể ghi vào file " + studentsFile);
        }
    }

    public void loadStudentsFromFile() {
        try {
            FileInputStream fileIn = new FileInputStream(studentsFile);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            students = (List<Student>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Danh sách sinh viên đã được đọc từ file.");
        } catch (IOException e) {
            System.out.println("Lỗi: Không thể đọc từ file " + studentsFile);
        } catch (ClassNotFoundException e) {
            System.out.println("Lỗi: Lớp Student không tìm thấy.");
        }
    }

    public void saveGradesToFile() {
        try {
            FileWriter writer = new FileWriter(gradesFile);
            for (Student student : students) {
                writer.write(student.getName() + "  " + student.getGrade() + "\n");
            }
            writer.close();
            System.out.println("Điểm số đã được ghi vào file.");
        } catch (IOException e) {
            System.out.println("Lỗi: Không thể ghi vào file " + gradesFile);
        }
    }

    public void loadGradesFromFile() {
        try {
            FileReader reader = new FileReader(gradesFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                if (parts.length >= 2) {
                    double grade = Double.parseDouble(parts[1]);
                    updateGrade(name, grade);
                }
            }
            reader.close();
            System.out.println("Điểm số đã được đọc từ file.");
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi: File " + gradesFile + " không tìm thấy.");
        } catch (IOException e) {
            System.out.println("Lỗi: Không thể đọc từ file " + gradesFile);
        }
    }
}
