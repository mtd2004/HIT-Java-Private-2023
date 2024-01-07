package BTVN_B10.Bai3;

import java.util.Scanner;

public class IPv4Validation {
    private static boolean isValidIPv4Address(String input) {
        String regex = "^(\\d{1,3}\\.){3}\\d{1,3}$";
        if (input.matches(regex)) {
            String[] parts = input.split("\\.");
            for (String part : parts) {
                int number = Integer.parseInt(part);
                if (number < 0 || number > 255) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào địa chỉ IPv4: ");
        String input = sc.nextLine();

        if (isValidIPv4Address(input)) {
            System.out.println("Địa chỉ IPv4 hợp lệ.");
        } else {
            System.out.println("Địa chỉ IPv4 không hợp lệ.");
        }
    }
}
