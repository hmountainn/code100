package code100;

import java.util.Scanner;

public class Main78 {//입력된 정수까지 짝수 더하기

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int sum=0;
		for(int i=0; i<=a; i++) {
			if(i%2==0) {
				sum = sum + i;
			}
			
			
			} System.out.println(sum);
		
		}

	}


