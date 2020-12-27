package code100;

import java.util.Scanner;

public class Main75 { //입력된수 -1부터 0까지

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		for(int i=(a-1); i>=0; i--) {
			System.out.println(i);
		}

	}

}

