package code100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main84 {//Buffered로 입출력해보기

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String v = bf.readLine();
		
		StringTokenizer st = new StringTokenizer(v);
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int num = 0;
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				String s = "";
				for(int g=0; g<c; g++) {
					s += i+" "+j+" "+g+"\n";
					num++;
				}
				bw.write(s);
				bw.flush();
			}
		} System.out.println(num);
	} 

}
