package code100;

import java.util.Scanner;

public class Main66 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[3];
		
		for(int i=0; i<3; i++) {
			a[i] = scan.nextInt();
		}
		//¦�� even Ȧ�� odd ���
		for(int i=0; i<3; i++) {
			if(a[i]%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}
	}

}
