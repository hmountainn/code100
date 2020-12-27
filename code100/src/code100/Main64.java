package code100;

import java.util.Scanner;

public class Main64{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        int d = (a<b ? a:b)<c ? (a<b ? a:b) : c; //3개중 제일 작은값
        System.out.println(d);
    }
}