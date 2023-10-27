package BTVN_B2;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = s.toLowerCase();
        int cnt = 0;
        int[] dem = new int[26];
        for (int i = 0; i < ans.length(); i++) {
            dem[(int) (ans.charAt(i)) - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            if (dem[i] != 0) {
                cnt++;
            }
        }
        if (cnt == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
