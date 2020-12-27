package code100;

import java.util.Scanner;

public class Main { //특정 숫자까지 짝수합 구하기

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int sum = 0;
		
		for(int i=1; i<=a; i++) {
			if(i%2 == 0) {
				sum = sum + i;
			}
			else {
				continue;
			}
			
		}
		System.out.println(sum);

	}

}
