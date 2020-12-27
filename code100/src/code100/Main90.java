package code100;

import java.util.Scanner;

public class Main90 { //등비수열 n번째 수

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int r = scan.nextInt();
		int n = scan.nextInt();
		double result = a*Math.pow(r, n-1);
		
		System.out.printf("%.0f",result);
	}

}
