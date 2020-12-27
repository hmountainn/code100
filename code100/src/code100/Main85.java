package code100;

import java.util.Scanner;

public class Main85 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int s = scan.nextInt();
		
		double one = (h*b*c*s)/8;
		double two = one/1024;
		double three = two/1024;
		System.out.printf("%.1f MB", three);
	}

}
