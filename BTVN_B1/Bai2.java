package BTVN_B1;
import java.util.Scanner ;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() , b = sc.nextInt() ;
        String s = "" ;
        while(n != 0)
        {
            int r = n % b ;
            if(r < 10)
                s = n % b + s ;
            else
            {
                char c = (char)(r + 55) ;
                s = c + s ;
            }
            n /= b ;
        }
        System.out.println(s);
    }
}
