package BTVN_B10.Bai2;

import java.util.Scanner;

public class CheckDate {
    private static boolean isValidDateFormat(String input) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        return input.matches(regex);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi ngày tháng năm : ");
        String input = sc.nextLine();
        if (isValidDateFormat(input)) {
            System.out.println("Chuỗi có định dạng ngày tháng năm hợp lệ.");
        } else {
            System.out.println("Chuỗi không có định dạng ngày tháng năm hợp lệ.");
        }
    }

}
