package BTVN_B7;

import java.util.Scanner;

public class Main {

    private static University university = new University();
    private static Scanner sc = new Scanner(System.in);

    public static void Menu() {
        System.out.println("----------------------Menu----------------------");
        System.out.println("1. Hien Thi Tat Ca Sinh Vien Cua Truong");
        System.out.println("2. Hien Thi Cac Khoa Hoc Trong Truong");
        System.out.println("3. Them Sinh Vien");
        System.out.println("4. Xoa Sinh Vien");
        System.out.println("5. Them Khoa Hoc");
        System.out.println("6. Xoa Khoa Hoc");
        System.out.println("7. Dang Ky Khoa Hoc Cho Sinh Vien");
        System.out.println("0. Thoat");
        System.out.println("------------------------------------------------");
        System.out.print("Nhap Lua Chon Cua Ban : ");
    }

    public static void getStudents() {
        university.displayAllStudents();
    }

    public static void getCourse() {
        university.displayAllCourses();
    }

    public static void addStudent() {
        System.out.print("Nhap ID : ");
        String id = sc.nextLine();
        System.out.print("Nhap Name : ");
        String name = sc.nextLine();
        System.out.print("Nhap Age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap Grade : ");
        String grade = sc.nextLine();

        Student student = new Student(age, grade, id, name);
        university.addStudent(student);
    }

    public static void removeStudent() {
        System.out.print("Nhap ID Sinh Vien Can Xoa : ");
        String id = sc.nextLine();

        Student studentToRemove = null;
        for (Student student : university.getStudents()) {
            if (student.getId().equals(id)) {
                studentToRemove = student;
                break;
            }
        }

        if (studentToRemove != null) {
            university.getStudents().remove(studentToRemove);
            System.out.println("Sinh Vien Da Duoc Xoa Thanh Cong");
        } else {
            System.out.println("Khong Tim Thay Sinh Vien Co ID : " + id);
        }
    }

    public static void addCourse() {
        System.out.print("Nhap Course ID : ");
        String courseID = sc.nextLine();
        System.out.print("Nhap Course Name : ");
        String courseName = sc.nextLine();

        Course course = new Course(courseID, courseName);
        university.addCourse(course);
        System.out.println("Khoa Hoc Da Duoc Them Thanh Cong");
    }

    public static void removeCourse() {
        System.out.print("Nhap Course ID : ");
        String courseID = sc.nextLine();

        Course courseToRemove = null;
        for (Course course : university.getCourses()) {
            if (course.getCourseID().equals(courseID)) {
                courseToRemove = course;
                break;
            }
        }

        if (courseToRemove != null) {
            university.getCourses().remove(courseToRemove);
            System.out.println("Khoa Hoc Da Duoc Xoa Thanh Cong");
        } else {
            System.out.println("Khong Tim Thay Khoa Hoc Co ID : " + courseID);
        }
    }

    private static void enrollStudentInCourse() {
        System.out.print("Nhap ID Sinh Vien : ");
        String id = sc.nextLine();
        System.out.print("Nhap Course ID : ");
        String courseID = sc.nextLine();
        Student studentToEnroll = null;
        for (Student student : university.getStudents()) {
            if (student.getId().equals(id)) {
                studentToEnroll = student;
                break;
            }
        }

        Course courseToEnroll = null;
        for (Course course : university.getCourses()) {
            if (course.getCourseID().equals(courseID)) {
                courseToEnroll = course;
                break;
            }
        }

        if (studentToEnroll != null && courseToEnroll != null) {
            studentToEnroll.enroll(courseToEnroll);
            System.out.println("Sinh Vien Da Dang Ky Khoa Hoc Thanh Cong");
        } else {
            System.out.println("Khong Tim Thay Khoa Hoc Hoac Sinh Vien Tuong Ung");
        }
    }

    public static void main(String[] args) {
        while (true) {
            Menu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    getStudents();
                    break;
                case 2:
                    getCourse();
                    break;
                case 3:
                    addStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    addCourse();
                    break;
                case 6:
                    removeCourse();
                    break;
                case 7:
                    enrollStudentInCourse();
                    break;
                case 0:
                    System.out.println("Chuong Trinh Da Thoat");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Gia Tri Ban Nhap Khong Hop Le. Vui Long Nhap Lai");
            }
        }
    }
}
