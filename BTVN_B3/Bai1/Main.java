package BTVN_B3.Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static int MAXN = 1000000;

    public static void Menu() {
        System.out.println("1. Nhap Mot Loai Rau Cu Moi");
        System.out.println("2. Hien Thi Danh Sach Rau Cu");
        System.out.println("3. Sap Xep Rau Cu Theo So Tien Thu Duoc Tang Dan");
        System.out.println("4. Nhom Cac Rau Cu");
        System.out.println("5. Tim Kiem Rau Cu");
        System.out.println("6. Thoat Menu");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vegetable> vegetableList = new ArrayList<>();
        while (true) {
            Menu();
            System.out.print("Nhap Lua Chon Cua Ban : ");
            int luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.print("Nhap ID : ");
                    sc.nextLine();
                    String inputID = sc.nextLine();
                    System.out.print("Nhap Ten Rau Cu : ");
                    String inputName = sc.nextLine();
                    System.out.print("Nhap Don Vi Tinh : ");
                    String inputUnit = sc.nextLine();
                    System.out.print("Nhap So Luong Da Ban : ");
                    int inputQtySold = sc.nextInt();
                    System.out.print("Nhap Phan Tram Giam Gia : ");
                    int inputSale = sc.nextInt();
                    System.out.print("Nhap Gia Goc : ");
                    double inputPrice = sc.nextDouble();
                    Vegetable vegetable = new Vegetable(inputID, inputName, inputUnit, inputQtySold, inputSale, inputPrice);
                    vegetableList.add(vegetable);
                    System.out.println("Rau Cu Da Duoc Them");
                    break;
                case 2:
                    if (vegetableList.isEmpty()) {
                        System.out.println("Khong Co Loai Rau Cu Nao");
                    } else {
                        System.out.println("Danh Sach Rau Cu");
                        System.out.printf("%-3s%-15s%-10s%-15s%-5s%-15s%-15s\n","Id","Name","Unit","Quantity sold","Sale", "Price","Revenue");
                        for (Vegetable temp : vegetableList) {
                            temp.display();
                        }
                    }
                    break;
                case 3:
                    Collections.sort(vegetableList, Comparator.comparing(Vegetable::getTotalRevenue));
                    System.out.println("Danh Sach Rau Cu Da Duoc Sap Xep");
                    break;
                case 4:
                    Collections.sort(vegetableList, Comparator.comparing(Vegetable::getUnit).thenComparing(Vegetable::getPrice));
                    System.out.println("Da Phan Loai Cac Nhom Rau Cu");
                    break;
                case 5:
                    System.out.print("Nhap Ten Rau Cu Ban Muon Tim Kiem : ");
                    sc.nextLine();
                    String keyword = sc.nextLine();

                    ArrayList<Vegetable> matchingVegetables = new ArrayList<>();
                    for (Vegetable temp : vegetableList) {
                        if (temp.getName().toLowerCase().contains(keyword.toLowerCase())) {
                            matchingVegetables.add(temp);
                        }
                    }

                    if (matchingVegetables.isEmpty()) {
                        System.out.println("Khong Co Loai Rau Cu Nao De Tim Kiem");
                    } else {
                        System.out.println("Thong Tin Rau Cu Dang Tim Kiem");
                        for (Vegetable temp : matchingVegetables) {
                            temp.display();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Chuong Trinh Da Dung Lai");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Gia Tri Ban Nhap Khong Hop Le");
            }
        }
    }

}
