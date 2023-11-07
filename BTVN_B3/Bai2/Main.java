package BTVN_B3.Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void Menu() {
        System.out.println("1. Them Mot Tiet Hoc Moi");
        System.out.println("2. Hien Thi Danh Sach Mon Hoc");
        System.out.println("3. Sap Xep Mon Hoc Theo Thoi Gian Ket Thuc Tang Dan");
        System.out.println("4. Lua Chon Mon Hoc");
        System.out.println("5. Thoat Chuong Trinh");
        System.out.print("Nhap Lua Chon Cua Ban: ");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Subject> list = new ArrayList<>();
        while (true) {
            Menu();
            int choice = scan.nextInt();
            System.out.println();
            scan.nextLine();
            switch (choice) {
                case 1: {
                    System.out.print("Nhap ID: ");
                    String ID = scan.nextLine();
                    System.out.print("Nhap Ten Tiet Hoc : ");
                    String subjectName = scan.nextLine();
                    System.out.print("Nhap So Luong Hoc Sinh : ");
                    int studentCount = scan.nextInt();
                    System.out.print("Nhap Thoi Gian Bat Dau : ");
                    scan.nextLine();
                    String timeStart = scan.nextLine();
                    System.out.print("Nhap Thoi Gian Ket Thuc : ");
                    String timeEnd = scan.nextLine();
                    Subject subject = new Subject(ID, subjectName, studentCount, timeStart, timeEnd);
                    list.add(subject);
                    break;
                }
                case 2: {
                    System.out.printf("%-4s %-30s %-20s %-20s \n", "ID", "Subject name", "Student Count", "Time start - Time End");
                    for (Subject subject : list) {
                        subject.display();
                    }
                    break;
                }
                case 3: {
                    Collections.sort(list, new Sort());
                    break;
                }
                case 4: {
                    ArrayList<Subject> temporarilyList = new ArrayList<>();
                    for (Subject subject : list) {
                        temporarilyList.add(subject);
                    }

                    Collections.sort(temporarilyList, new Sort());
                    System.out.print("Nhap Thoi Gian Bat Dau : ");
                    String start = scan.nextLine();
                    int startTime = Integer.parseInt(start.substring(0, 2)) * 60 + Integer.parseInt(start.substring(3, 5));

                    System.out.print("Nhap Thoi Gian Ket Thuc : ");
                    String end = scan.nextLine();
                    int temp = startTime;
                    int cnt = 0;
                    int endTime = Integer.parseInt(end.substring(0, 2)) * 60 + Integer.parseInt(end.substring(3, 5));

                    for (Subject subject : list) {
                        if (subject.getStartMinutes() >= temp && subject.getEndMinutes() <= endTime) {
                            temp = subject.getEndMinutes();
                            cnt++;
                        }
                    }
                    System.out.println("Sinh Vien Co The Hoc : " + cnt + "Mon");

                    temp = startTime;
                    for (Subject subject : list) {
                        if (subject.getStartMinutes() >= temp && subject.getEndMinutes() <= endTime) {
                            temp = subject.getEndMinutes();
                            subject.display();
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("Chuong Trinh Da Ket Thuc");
                    System.exit(0) ;
                    return;
                }
                default:
                    System.out.println("Gia Tri Ban Nhap Khong Hop Le");
                    break;
            }
        }
    }
}
