package code100;

import java.util.Scanner;

public class Main37{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a;
        char b;
        a = scan.nextInt();
        b = (char)a; //숫자 아스키코드로 변경
        
        System.out.println(b);
    }
}