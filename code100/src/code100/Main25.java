package code100;

import java.util.Scanner;

public class Main25{
    public static void main(String[] args){
        int a;
        
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        int[] c = new int[6];
        for(int i=0; i<5; i++) {
        	int b = (int)Math.pow(10, i);
        	c[i] = (a%10)*b;
        	a = a/10;
        	
        }
        
        for(int i=4; i>=0; i--) {
        	System.out.println("["+c[i]+"]");
        }
        
        
        
    }
}