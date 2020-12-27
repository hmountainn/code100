package code100;

import java.util.Scanner;

public class Main80 {//입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력

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
