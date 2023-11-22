package BTVN_B5.Bai2;

import java.util.Scanner;

public class Hang {

    private String ten;
    private String dvtinh;
    private int soluong;
    private int dongia;

    public Hang() {
    }

    public Hang(String ten, String dvtinh, int soluong, int dongia) {
        this.ten = ten;
        this.dvtinh = dvtinh;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDvtinh() {
        return dvtinh;
    }

    public void setDvtinh(String dvtinh) {
        this.dvtinh = dvtinh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        this.setTen(sc.nextLine());
        System.out.print("Nhap don vi tinh: ");
        this.setDvtinh(sc.nextLine());
        System.out.print("Nhap so luong: ");
        this.setSoluong(sc.nextInt());
        System.out.print("Nhap don gia: ");
        this.setDongia(sc.nextInt());
    }

    public void output() {
        System.out.println(
                "Ten: " + this.getTen()
                + "Don vi tinh: " + this.getDvtinh()
                + "So luong: " + this.getSoluong()
                + "Don gia: " + this.getDongia()
        );
    }
}
