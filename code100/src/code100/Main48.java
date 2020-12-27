package code100;

import java.util.Scanner;

public class Main48{ 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        float c = (float) (a*Math.pow(2,b)); //a °öÇÏ±â 2^b ÇÑ°ª
        System.out.println((int)c);
        
}
}