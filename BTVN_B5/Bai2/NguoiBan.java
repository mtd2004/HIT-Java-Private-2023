package BTVN_B5.Bai2;

import java.util.Scanner;

public class NguoiBan {

    private String ten;
    private String masothue;
    private String diachi;
    private int dienthoai;
    private int sotk;

    public NguoiBan() {
    }

    public NguoiBan(String ten, String masothue, String diachi, int dienthoai, int sotk) {
        this.ten = ten;
        this.masothue = masothue;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.sotk = sotk;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMasothue() {
        return masothue;
    }

    public void setMasothue(String masothue) {
        this.masothue = masothue;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(int dienthoai) {
        this.dienthoai = dienthoai;
    }

    public int getSotk() {
        return sotk;
    }

    public void setSotk(int sotk) {
        this.sotk = sotk;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        this.setTen(sc.nextLine());
        System.out.print("Nhap ma so thue: ");
        this.setMasothue(sc.nextLine());
        System.out.print("Nhap dia chi: ");
        this.setDiachi(sc.nextLine());
        System.out.print("Nhap so tk: ");
        this.setSotk(sc.nextInt());
        System.out.print("Nhap dien thoai: ");
        this.setDienthoai(sc.nextInt());
    }

    public void output() {
        System.out.println(
                "Ten nguoi ban: " + this.getTen()
                + "\nMa so thue: " + this.getMasothue()
                + "\nDia chi: " + this.getDiachi()
                + "\nDien thoai: " + this.getDienthoai()
        );
    }
}
