package code100;

import java.util.Scanner;

public class Main34{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a;
        int b;
        a = scan.nextLine();
        b = Integer.valueOf(a,8); //String 8������ 10������ ��ȯ
        
        System.out.printf("%d", b); //8���� �Է¹޾Ƽ� 10������ ���
    }
}