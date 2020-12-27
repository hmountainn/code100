package code100;

import java.util.Scanner;

public class Main92 { //최소공배수

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int i = 1;
		while(i%a!=0 || i%b!=0 || i%c!=0){
			i++;
		}
		System.out.println(i);
	}

}
