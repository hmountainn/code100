package code100;

import java.util.Scanner;

public class Main76 { //�ƽ�Ű�ڵ� a���� �Էµ� �˹ٺ����� ���

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char a = scan.nextLine().charAt(0);
		int b = (int)a;
		int a1 = (int)'a';
		
		for(int i=a1; i<=b; i++ ) {
			
			char a2 = (char)a1;
			System.out.print(a2+" ");
			a1 = a1+1;
		}

	}

}
