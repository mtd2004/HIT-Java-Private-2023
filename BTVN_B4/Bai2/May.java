package BTVN_B4.Bai2;

import java.util.Scanner;

public class May {

    static Scanner sc = new Scanner(System.in);
    private int maMay;
    private String kieuMay;
    private String tinhTrang;

    public May() {

    }

    public May(int maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void nhap() {
        System.out.print("Nhập ID Máy : ");
        this.maMay = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập Kiểu Máy : ");
        this.kieuMay = sc.nextLine();
        System.out.print("Nhập Tình Trạng Máy : ");
        this.tinhTrang = sc.nextLine();
    }

    public void xuat() {
        System.out.println("ID Máy : " + this.maMay);
        System.out.println("Kiểu Máy : " + this.kieuMay);
        System.out.println("Tình Trạng : " + this.tinhTrang);
    }
}
