package KiemTra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    
    public static void menu() {
        System.out.println("\n1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Search Student");
        System.out.println("4. Sorted Student");
        System.out.println("5. Show All Student");
        System.out.println("6. The End");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        List<Student> list = new ArrayList<>() ;
        StudentService listMain = new StudentServiceImpl(list) ;
        while(true) {
            menu() ;
            System.out.print("Nhap Lua Chon Cua Ban : ");
            int choice = sc.nextInt() ;
            sc.nextLine();
            switch(choice) {
                case 1 : 
                    System.out.println("Nhap Thong Tin Sinh Vien Can Them : ");
                    System.out.print("Name : ");
                    String name = sc.nextLine() ;
                    System.out.print("Age : ");
                    short age = sc.nextShort() ;
                    sc.nextLine() ;
                    System.out.print("District : ");
                    String district = sc.nextLine() ;
                    System.out.print("City : ");
                    String city = sc.nextLine() ;
                    System.out.print("Scores : ");
                    double scores = sc.nextDouble() ;
                    Address address = new Address(district , city) ;
                    Student student = new Student(scores , name , age , address) ;
                    listMain.addStudent(student);
                    break ;
                case 2 : 
                    System.out.print("Nhap ID Cua Sinh Vien Can Xoa : ");
                    int deleteID = sc.nextInt() ;
                    listMain.deleteStudent(deleteID);
                    break ;
                case 3 :
                    System.out.print("Nhap Ten Sinh Vien Can Tim Kiem : ");
                    String findName = sc.nextLine() ;
                    listMain.searchStudent(findName);
                    break ;
                case 4 : 
                    listMain.sortedStudent();
                    System.out.println("Da Sap Xep Sinh Vien Theo Diem Giam Dan");
                    break ;
                case 5 :
                    listMain.showAllStudent();
                    break ;
                case 6 : 
                    System.out.println("Chuong Trinh Da Ket Thuc");
                    System.exit(0) ;
                    break ;
                default :
                    System.out.println("Gia Tri Ban Nhap Khong Hop Le. Vui Long Nhap Lai");
            }
        }
        
        
    }
}
