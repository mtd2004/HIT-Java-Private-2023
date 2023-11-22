package BTVN_B5.Bai2;

import java.util.Scanner;

public class NguoiMua {

    private String ho;
    private String ten;
    private String diachi;
    private int sotk;
    private String hinhthuctt;
    private String mst;

    public NguoiMua() {
    }

    public NguoiMua(String ho, String ten, String diachi, int sotk, String hinhthuctt, String mst) {
        this.ho = ho;
        this.ten = ten;
        this.diachi = diachi;
        this.sotk = sotk;
        this.hinhthuctt = hinhthuctt;
        this.mst = mst;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getSotk() {
        return sotk;
    }

    public void setSotk(int sotk) {
        this.sotk = sotk;
    }

    public String getHinhthuctt() {
        return hinhthuctt;
    }

    public void setHinhthuctt(String hinhthuctt) {
        this.hinhthuctt = hinhthuctt;
    }

    public String getMst() {
        return mst;
    }

    public void setMst(String mst) {
        this.mst = mst;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho: ");
        this.setHo(sc.nextLine());
        System.out.print("Nhap ten: ");
        this.setTen(sc.nextLine());
        System.out.print("Nhap dia chi: ");
        this.setDiachi(sc.nextLine());
        System.out.print("Nhap so tk: ");
        this.setSotk(sc.nextInt());
        System.out.print("Nhap hinh thuc thanh toan: ");
        this.setHinhthuctt(sc.nextLine());
        System.out.print("Nhap MST: ");
        this.setMst(sc.nextLine());
    }

    public void output() {
        System.out.println(
                "Ho: " + this.getHo()
                + "\nTen: " + this.getTen()
                + "\nDia chi: " + this.getDiachi()
                + "\nSo tk: " + this.getSotk()
                + "\nHinh thuc tt: " + this.getHinhthuctt()
                + "\nMST: " + this.getMst()
        );
    }
}
