package code100;

import java.util.Scanner;

public class Main59{ 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        System.out.println(~a); //비트연산 1->0 or 0->1바꿈
}
}