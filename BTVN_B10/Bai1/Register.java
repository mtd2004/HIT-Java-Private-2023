package BTVN_B10.Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Register {
    private static List<String> registeredUsernames = new ArrayList<>();

    private static boolean isUsernameValid(String username) {
        return username.matches("^(?!\\d)(?=.*[a-z0-9])[a-z0-9]{6,}$");
    }

    private static boolean isUsernameTaken(String username) {
        return registeredUsernames.contains(username);
    }

    private static boolean isPasswordValid(String password) {
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=])[A-Za-z\\d@#$%^&+=]{8,}$");
    }

    private static void registerAccount(Scanner sc) {
        System.out.print("Nhập username: ");
        String username = sc.nextLine();
        if(registeredUsernames.contains(username)) {
            System.out.println("Username đã tồn tại");
            return;
        }
        if (!isUsernameValid(username)) {
            System.out.println("Username không hợp lệ.");
            return;
        }

        if (isUsernameTaken(username)) {
            System.out.println("Username đã tồn tại.");
            return;
        }

        System.out.print("Nhập password: ");
        String password = sc.nextLine();

        if (!isPasswordValid(password)) {
            System.out.println("Password không hợp lệ.");
            return;
        }

        registeredUsernames.add(username);
        System.out.println("Đăng kí tài khoản thành công.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Đăng kí tài khoản");
            System.out.println("2. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    registerAccount(sc);
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
