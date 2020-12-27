package code100;

import java.util.Scanner;

public class Main63{ 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        int c = a>b ? a:b; //3항 연산자
        
        System.out.println(c);
}
}