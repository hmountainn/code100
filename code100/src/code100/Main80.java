package code100;

import java.util.Scanner;

public class Main80 {//�Էµ� ������ ���ų� Ŀ���� ��, �������� ���� ������ ���

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int sum = 0;
		int num = 0;
		
		while(true) {
			
			if(sum >= a) {
				System.out.println(num);
				break;
			}
			else {
				num++;
				sum += num;
				
			}
			
		}

	}

}
