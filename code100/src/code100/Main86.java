package code100;

import java.util.Scanner;

public class Main86 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		int b = scan.nextInt();
		double bt = (w*h*b)/8;
		double mb = bt/1024/1024;
		
		System.out.printf("%.2f MB", mb);

	}

}
