package code100;

import java.util.Scanner;

public class Main27{

	public static void main(String[] args) {
		
		String a;
		String[] b = new String [3];
		
		Scanner scan = new Scanner(System.in);
		a = scan.nextLine();
		b = a.split("\\.");
		
		System.out.printf("%02d-%02d-%04d", Integer.parseInt(b[2]),Integer.parseInt(b[1]),Integer.parseInt(b[0])); //Integer.parseInt()-> 문자열 숫자로 형변환
	}

}
