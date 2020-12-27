package code100;

import java.util.Scanner;

public class Main91 { //¼ö¿­ (a*m+d)

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		int m = scan.nextInt();
		int d = scan.nextInt();
		int n = scan.nextInt();
		
		for(int i = 1; i<n; i++) {
			a = a*m+d;
		}
		System.out.println(a);
		
	}

}
