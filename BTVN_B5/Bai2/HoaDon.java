package BTVN_B5.Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HoaDon {

    private String kyhieu;
    private int so;
    private String date;
    private NguoiBan ban = new NguoiBan();
    private NguoiMua mua = new NguoiMua();
    private ArrayList<Hang> ds_hang = new ArrayList<>();

    public HoaDon() {
    }

    public HoaDon(String kyhieu, int so, String date, NguoiBan ban, NguoiMua mua, ArrayList<Hang> ds_hang) {
        this.kyhieu = kyhieu;
        this.so = so;
        this.date = date;
        this.ban = ban;
        this.mua = mua;
        this.ds_hang = ds_hang;
    }

    public String getKyhieu() {
        return kyhieu;
    }

    public void setKyhieu(String kyhieu) {
        this.kyhieu = kyhieu;
    }

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public NguoiBan getBan() {
        return ban;
    }

    public void setBan(NguoiBan ban) {
        this.ban = ban;
    }

    public NguoiMua getMua() {
        return mua;
    }

    public void setMua(NguoiMua mua) {
        this.mua = mua;
    }

    public ArrayList<Hang> getDs_hang() {
        return ds_hang;
    }

    public void setDs_hang(ArrayList<Hang> ds_hang) {
        this.ds_hang = ds_hang;
    }

    public long tinhtien() {
        long tien = 0;
        for (Hang hang : ds_hang) {
            tien += hang.getDongia();
        }
        return tien;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ky hieu: ");
        this.setKyhieu(sc.nextLine());
        System.out.print("Nhap so don: ");
        this.setSo(sc.nextInt());
        sc.nextLine();
        System.out.print("Ngay lap: ");
        this.setDate(sc.nextLine());
        System.out.print("Nhap so luong sp: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Hang h = new Hang();
            h.input();
            ds_hang.add(h);
        }
    }

    public Hang most() {
        int n = 0;
        Hang ans = new Hang();
        for (Hang i : ds_hang) {
            if (i.getSoluong() > n) {
                n = i.getSoluong();
                ans = i;
            }
        }
        return ans;
    }

    public void output() {
        System.out.println("                     HÓA ĐƠN BÁN HÀNG                     ");
        System.out.printf("%-50s\n", ("Ky hieu: " + this.kyhieu));
        System.out.printf("%-50s\n", ("So: " + this.so));
        System.out.println("                " + date);
        ban.output();
        System.out.println("----------------------------------------------------------------");
        mua.output();
        System.out.println("----------------------------------------------------------------");
        int count = 1;
        System.out.printf("%-5s%-25s%-15s%-15s%-15s%-15s\n", "STT", "Tên hàng hóa, dịch vụ", "Đơn vị tính", "Số lươợng", "Đơn giá", "Thành tiền");
        for (Hang i : ds_hang) {
            System.out.printf("%-5d", count);
            i.output();
        }
        System.out.println("Tổng tiền thanh toán: " + this.tinhtien());
        System.out.printf("%-20s%-20s\n", "Người mua hàng", "Người bán hàng");
        System.out.printf("%-20s%-20s\n", mua.getTen(), ban.getTen());
        System.out.println("Cần kiểm tra, đối chiếu khi lập, nhận hóa đơn");
    }
}
