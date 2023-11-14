package BTVN_B4.Bai2;

import java.util.Scanner;

public class QuanLy {

    static Scanner sc = new Scanner(System.in);
    private String maQL;
    private String tenQl;

    public QuanLy() {

    }

    public QuanLy(String maQL, String tenQl) {
        this.maQL = maQL;
        this.tenQl = tenQl;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getTenQl() {
        return tenQl;
    }

    public void setTenQl(String tenQl) {
        this.tenQl = tenQl;
    }

    public void nhap() {
        System.out.print("Nhập ID : ");
        this.maQL = sc.nextLine();
        System.out.print("Nhập Tên : ");
        this.tenQl = sc.nextLine();
    }

    public void xuat() {
        System.out.println("ID : " + this.maQL);
        System.out.println("Tên : " + this.tenQl);
    }
}
