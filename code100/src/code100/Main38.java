package code100;

import java.util.Scanner;

public class Main38{ //정수 long 범위 합
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long a;
        long b;
        a = scan.nextLong();
        b = scan.nextLong();
        long c = a+b;
        System.out.println(c);
    }
}