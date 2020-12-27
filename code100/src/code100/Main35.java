package code100;

import java.util.Scanner;

public class Main35{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a;
        int b;
        a = scan.nextLine();
        b = Integer.parseInt(a, 16); //문자 16진수 를 정수로 변환

        System.out.printf("%o", b); //8진수로 출력
    }
}