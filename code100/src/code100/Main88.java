package code100;

import java.util.Scanner;

public class Main88 { //1���� �Է��������� 3�ǹ�� ���� ���

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		for(int i =0; i<=a; i++) {
			if(i%3==0) {
				continue;
			}else {
				System.out.print(i+" ");
			}
		}

	}

}
