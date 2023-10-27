package BTVN_B2;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0, fre = 0;
        for (int i = 0; i < n; i++) {
            boolean check = true;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                int cnt = 1;
                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j]) {
                        cnt++;
                    }
                }
                if (fre < cnt) {
                    ans = a[i];
                    fre = cnt;
                } else if (fre == cnt) {
                    if (ans > a[i]) {
                        ans = a[i];
                    }
                }
            }
        }
        System.out.println(ans + " " + fre);
    }
}
