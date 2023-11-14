package BTVN_B4.Bai2;

import java.util.Scanner;

public class PhongMay {

    public static Scanner sc = new Scanner(System.in);
    private String maPhongMay;
    private String tenPhong;
    QuanLy x = new QuanLy();
    private May[] y;
    private int n;

    public PhongMay(String maPhongMay, String tenPhong, QuanLy x, May[] y, int n) {
        this.maPhongMay = maPhongMay;
        this.tenPhong = tenPhong;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public PhongMay() {

    }

    public String getMaPhongMay() {
        return maPhongMay;
    }

    public void setMaPhongMay(String maPhongMay) {
        this.maPhongMay = maPhongMay;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void nhap() {
        System.out.print("Nhập Mã Phòng Máy : ");
        this.maPhongMay = sc.nextLine();
        System.out.print("Nhập Tên Phòng : ");
        this.tenPhong = sc.nextLine();
        x.nhap();
        System.out.print("Nhập Số Lượng Máy : ");
        this.n = sc.nextInt();
        sc.nextLine();
        y = new May[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập Thông Tin Máy Thứ " + (i + 1) + " : ");
            y[i] = new May();
            y[i].nhap();
        }
    }

    public void xuat() {
        System.out.println("Mã Phòng Máy : " + this.maPhongMay);
        System.out.println("Tên Phòng : " + this.tenPhong);
        x.xuat();
        for (int i = 0; i < n; i++) {
            System.out.println("Thông Tin Của Máy Thứ " + (i + 1) + "---");
            y[i].xuat();
        }
    }

    public void search1(String key) {
        boolean find = false;
        for (int i = 0; i < n; i++) {
            if (y[i].getKieuMay().contains(key)) {
                find = true;
                y[i].xuat();
            }
        }
        if (!find) {
            System.out.println("Không Tìm Thấy Thông Tin Máy");
        }
    }

    public void search2(int key) {
        boolean find = false;
        for (int i = 0; i < n; i++) {
            if (y[i].getMaMay() == key) {
                find = true;
                y[i].xuat();
            }
        }
        if (!find) {
            System.out.println("Không Thể Tìm Thấy Thông Tin Máy");
        }
    }

}
