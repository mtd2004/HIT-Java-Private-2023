package BTVN_B1;
import java.util.Scanner ;
public class Bai1 {
    public static int gcd(int a , int b)
    {
        while(b != 0)
        {
            int r = a % b ;
            a = b ;
            b = r ;
        }
        return a ;
    }
    public static int lcm(int a , int b)
    {
        return a / gcd(a , b) * b ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() , b = sc.nextInt() , c = sc.nextInt() ;
        System.out.println(lcm(lcm(a , b) , c) + " " + gcd(gcd(a , b) , c));
        
    }
}
