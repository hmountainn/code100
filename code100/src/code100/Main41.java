package code100;

import java.util.Scanner;

public class Main41{ //�ƽ�Ű�ڵ� �ԷµȰ� ���� ���ĺ� ���
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