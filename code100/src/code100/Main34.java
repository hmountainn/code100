package code100;

import java.util.Scanner;

public class Main34{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a;
        int b;
        a = scan.nextLine();
        b = Integer.valueOf(a,8); //String 8진수를 10진수로 변환
        
        System.out.printf("%d", b); //8진수 입력받아서 10진수로 출력
    }
}