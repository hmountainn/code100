package code100;

import java.util.Scanner;

public class Main42{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        float c = a/b;
        System.out.println((int)c); //a를 b로 나누고 정수형태로 출력
    }
}