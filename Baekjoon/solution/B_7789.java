package solution;

import java.io.*;
import java.util.StringTokenizer;

//텔레프라임
public class B_7789 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //원래 전화번호
		int M = Integer.parseInt(st.nextToken()); //새로운 전화번호
		
		if(N % 2 == 0 || N % 3 == 0) {
			bw.write("No");
		} else {
			bw.write("Yes");
		}
		//소수 구분 
		
		bw.flush();
		bw.close();
	}
}
