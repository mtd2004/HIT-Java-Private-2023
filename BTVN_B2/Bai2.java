package BTVN_B2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] f = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            f[i] = f[i - 1] + a[i];
        }
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int l = sc.nextInt(), r = sc.nextInt();
            System.out.println(f[r] - f[l - 1]);
        }
    }
}
