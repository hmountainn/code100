package code100;

import java.util.Scanner;

public class Main93 { //�⼮ �������� �θ��� �θ�Ƚ�� ���

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int num[] = new int[23];
		
		for(int i=0; i<count; i++) {
			int a = scan.nextInt();
			num[a-1] = num[a-1]+1;
		}
		
		for(int j=0; j<num.length; j++) {
			System.out.print(num[j]+" ");
		}
		

	}

}
