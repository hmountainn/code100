package code100;

import java.util.Scanner;

public class Main72 { //���� �����Է��ϰ� ������� ���

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] b = new int[a];
		
		for(int i=0; i<a; i++) {
			b[i] = scan.nextInt();
			System.out.println(b[i]);
		}

	}
}
