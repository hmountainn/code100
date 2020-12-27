package code100;

import java.util.Scanner;

public class Main67 { //숫자 입력하면 양수/음수 and 짝수/홀수 출력

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
