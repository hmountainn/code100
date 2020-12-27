package code100;

import java.util.Scanner;

public class Main79 {//q입력될때까지 출력

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		char[] b = new char[a.length()];
		
		for(int i = 0; i<a.length(); i++) {
			b[i] = a.charAt(i);
		}
		
			for(int i=0; i<a.length(); i++) {
				if(b[i] =='q') {
					System.out.println(b[i]);
					break;	
				}else if(b[i]== ' ') {
					continue;
			}else {
				System.out.println(b[i]);
			}
		}

	}

}
