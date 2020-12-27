package code100;

import java.util.Scanner;

public class Main46{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        float c = scan.nextInt();
        float sum = a+b+c;
        float avg = sum/3;
        System.out.println((int)sum); //합 정수형
        System.out.printf("%.1f",avg); // 평균 소숫점 1자리까지
}
}