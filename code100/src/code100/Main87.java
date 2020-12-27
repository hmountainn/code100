package code100;

import java.util.Scanner;

public class Main87 { //1부터 n까지의 합이 n보다 작을때까지만 실행

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int sum = 0;
		int i = 1;
		
		while(sum<a) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);

	}

}
