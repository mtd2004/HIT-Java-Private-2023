package BTVN;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a , b ;
        char c ;
        a = sc.nextInt() ;
        c = sc.next().charAt(0) ;
        b = sc.nextInt() ;
        switch(c)
        {
            case '+' :
                System.out.println(a + b);
                break ;
            case '-' :
                System.out.println(a - b);
                break ;
            case '*' :
                System.out.println(1L * a * b);
                break ;
            case '/' :
                if(b == 0)
                    System.out.println("INVALID");
                else
                    System.out.println((double)a / b);
                break ;
            default :
                System.out.println("INVALID");
        }
    }
}
