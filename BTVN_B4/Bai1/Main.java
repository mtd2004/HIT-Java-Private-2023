package BTVN_B4.Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static {
        // id, tenSach, namXuatBan, theLoai , tenTacGia , namSinh
        Sach[] book = new Sach[5];
        book[0] = new Sach("Book A", 1990, "Sẽ Gầy", "Nguyen Van A", 1930);
        book[1] = new Sach("Book B", 1991, "Kinh Dị", "Nguyen Van B", 1931);
        book[2] = new Sach("Book C", 1992, "Thám Hiểm", "Nguyen Van C", 1932);
        book[3] = new Sach("Book D", 1993, "Phiêu Lưu", "Nguyen Van D", 1933);
        book[4] = new Sach("Book E", 1994, "Buồn", "Nguyen Van E", 1934);
    }

    public static void main(String[] args) {
        ArrayList<Sach> list = new ArrayList<>();
        while (true) {
            System.out.println("                MENU                ");
            System.out.println("------------------------------------");
            System.out.println("1. Nhập Thông Tin Sách");
            System.out.println("2. Hiển Thị Toàn Bộ Thông Tin Sách");
            System.out.println("3. Tìm Sách Theo Tên");
            System.out.println("4. Sắp Xếp Theo Tên Tác Giả");
            System.out.println("5. Thoát Chương Trình");
            System.out.println("------------------------------------");
            System.out.print("Nhập Lựa Chọn Của Bạn : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Nhập Tên Sách : ");
                    String tenSach = sc.nextLine();
                    System.out.print("Nhập Năm Xuất Bản : ");
                    int namXuatBan = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập Thể Loại : ");
                    String theLoai = sc.nextLine();
                    System.out.print("Nhập Tên Của Tác Giả : ");
                    String tenTacGia = sc.nextLine();
                    System.out.print("Nhập Năm Sinh Của Tác Giả : ");
                    int namSinh = sc.nextInt();
                    sc.nextLine();
                    Sach book = new Sach(tenSach, namXuatBan, theLoai, tenTacGia, namSinh);
                    list.add(book);
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("Danh Sách Rỗng");
                    } else {
                        System.out.println("Thông Tin Tất Cả Các Cuốn Sách");
                        for (Sach sach : list) {
                            sach.output();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhập Tên Cuốn Sách Cần Tìm Kiếm : ");
                    String findBook = sc.nextLine();
                    boolean find = false;
                    for (Sach sach
                            : list) {
                        if (sach.getTenSach().contains(findBook)) {
                            sach.output();
                            find = true;
                            break;
                        }
                    }
                    if (!find) {
                        System.out.println("Không Thể Tìm Thấy Thông Tin Sách");
                    }
                    break;

                case 4:
                    Collections.sort(list, Comparator.comparing(Sach -> Sach.getX().getTenTacGia()));
                    for (Sach sach : list) {
                        sach.output();
                    }
                    System.out.println("Đã Sắp Xếp Sách Theo Tên Tác Giả");
                    break;
                case 5:
                    System.exit(0);
                    return;

                default:
                    System.out.println("Giá Trị Bạn Nhập Không Hợp Lệ !");
                    break;

            }
        }
    }
}
