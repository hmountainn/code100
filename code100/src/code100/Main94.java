package code100;

import java.util.Scanner;

public class Main94 {//배열 거꾸로 출력

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int num[] = new int[count];
		int reverse[] = new int[count];
		
		for(int i = 0; i<count; i++) {
			num[i] = scan.nextInt();
		}
		int a = 0;
		for(int j = count; j>0; j--) {
			reverse[j-1] = num[a];
			a++;
		}
		
		for(int z = 0; z<reverse.length; z++) {
			System.out.print(reverse[z]+" ");
		}
	}

}
