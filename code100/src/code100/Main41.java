package code100;

import java.util.Scanner;

public class Main41{ //아스키코드 입력된거 다음 알파벳 출력
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char a;
        int b;
        char c;
        a = scan.nextLine().charAt(0);
        b = (int)a;
        c = (char)(b+1);
        System.out.println(c);
    }
}