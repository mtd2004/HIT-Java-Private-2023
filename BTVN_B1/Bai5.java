package BTVN;
import java.util.Scanner ;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() , b = sc.nextInt() , c = sc.nextInt() ;
        int d = sc.nextInt() , e = sc.nextInt() ;
        int max1 = a , max2 = a ;
        if(b > max1)
        {
            max2 = max1 ;
            max1 = b ;
        }
        else if(b > max2)
            max2 = b ;
        if(c > max1)
        {
            max2 = max1 ;
            max1 = c ;
        }
        else if(c > max2)
            max2 = c ;
        if(d > max1)
        {
            max2 = max1 ;
            max1 = d ;
        }
        else if(d > max2)
            max2 = d ;
        if(e > max1)
        {
            max2 = max1 ;
            max1 = e ;
        }
        else if(e > max2)
            max2 = e ;
        System.out.println(max2 + " " + max1);
    }
}
