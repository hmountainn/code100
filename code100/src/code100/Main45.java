package code100;

import java.util.Scanner;

public class Main45{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        
        //합,차,곱,나누기,나머지,나눈값
        System.out.println(a+b); 
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.printf("%.2f",(float)a/b);
    }
}
