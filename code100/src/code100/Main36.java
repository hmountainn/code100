package code100;

import java.util.Scanner;

public class Main36{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char a;
        int b;
        a = scan.next().charAt(0); //첫번째 문자 추출
        b = (int)a; //아스키코드 숫자로 변경
        
        System.out.println(b);
    }
}