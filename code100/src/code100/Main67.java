package code100;

import java.util.Scanner;

public class Main67 { //���� �Է��ϸ� ���/���� and ¦��/Ȧ�� ���

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		if(a>0) {
			System.out.println("plus");
			
			if(a%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		
		}else {
				System.out.println("minus");
				if(-a%2==0) {
					System.out.println("even");
				}else {
					System.out.println("odd");
				}
			}
		
	}

}
