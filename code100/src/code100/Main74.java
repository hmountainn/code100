package code100;

import java.util.Scanner;

public class Main74 { //입력된수부터 1까지 출력

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		for(int i=a; i>0; i--) {
			System.out.println(i);
		}

	}

}
