package BTVN_B4.Bai2;

import java.util.Scanner;

public class Main {
    public static void menu() {
            System.out.println("------------ MENU ------------");
            System.out.println("1. Nhập Thông Tin Máy");
            System.out.println("2. In Ra Thông Tin Các Máy");
            System.out.println("3. Tìm Kiếm Máy Theo Kiểu");
            System.out.println("4. Tìm Kiếm Máy Theo Mã");
            System.out.println("5. Thoát Chương Trình");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhongMay pm = new PhongMay() ;
        while(true) {
            menu() ;
            System.out.print("Nhập Lựa Chọn Của Bạn : ");
            int choice = sc.nextInt() ;
            switch (choice) {
                case 1:
                    pm.nhap();
                    break;
                case 2:
                    pm.xuat();
                    break;
                case 3:
                    System.out.println("Nhập Kiểu Máy Cần Tìm : ");
                    String type = sc.nextLine() ;
                    pm.search1(type);
                    break;
                case 4:
                    System.out.print("Nhập Mã Máy Cần Tìm : ");
                    int ID = sc.nextInt() ;
                    pm.search2(ID);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Giá Trị Bạn Nhập Không Hợp Lệ");
                    break;
            }
        }
    }
}
