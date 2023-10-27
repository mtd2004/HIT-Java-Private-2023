package BTVN_B2;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int chuCai = 0, chuSo = 0, dacBiet = 0;
        for (char x : s.toCharArray()) {
            if (Character.isAlphabetic(x)) {
                chuCai++;
            } else if (Character.isDigit(x)) {
                chuSo++;
            } else {
                dacBiet++;
            }
        }
        System.out.println(chuCai + " " + chuSo + " " + dacBiet);
    }
}
