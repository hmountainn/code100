package code100;

import java.util.Scanner;

public class Main95 {//입력숫자중 제일 작은숫자 출력

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int num[] = new int[count];
		
		for(int i=0; i<count; i++) {
			num[i] = scan.nextInt();
		}
		
		int result = num[0];
		for(int j=1; j<count; j++) {
			if(result<=num[j]) {
				continue;
			}else {
				result = num[j];
			}
		}
		System.out.println(result);
	}

}
