package BTVN_B1;
import java.util.Scanner ;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        long ans = 1 ;
        while(n != 0)
        {
            ans *= n % 10 ;
            n /= 10 ;
        }
        System.out.println(ans);
    }
}
