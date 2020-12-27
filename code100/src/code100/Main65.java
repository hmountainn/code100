package code100;

import java.util.Scanner;

public class Main65{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        //짝수 출력하기
        if(a%2==0){
            System.out.println(a);
        }
        if(b%2==0){
            System.out.println(b);
        }
        if(c%2==0){
            System.out.println(c);
        }
    }
}
