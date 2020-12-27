package code100;

import java.util.Scanner;

public class Main82 { // 16진수 구구단 (미완성)

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char a = scan.nextLine().charAt(0);
		int b = (int)a;
		String c = String.format("%x", b);
		
		
		System.out.println(a+"*1+="+a*1);

	}

}
