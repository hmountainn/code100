package code100;

import java.util.Scanner;

public class Main87 { //1���� n������ ���� n���� ������������ ����

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
