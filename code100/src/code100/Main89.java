package code100;

import java.util.Scanner;

public class Main89 { //�������� n��°��

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int d = scan.nextInt();
		int n = scan.nextInt();
		int sum = a+(d*(n-1));
		
		System.out.println(sum);
		
	}

}
