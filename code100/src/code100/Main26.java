package code100;

import java.util.Scanner;

public class Main26 {

	public static void main(String[] args) {
		
		String a;
		String[] b = new String [3];
		
		Scanner scan = new Scanner(System.in);
		a = scan.nextLine();
		b = a.split(":");
		
		System.out.printf("%d", Integer.parseInt(b[1])); //Integer.parseInt()-> 문자열 숫자로 형변환
	}

}
