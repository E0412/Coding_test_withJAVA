package solution;

import java.io.*;
import java.util.StringTokenizer;

//캠핑
public class B_4796 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());
		
		int max = 0;
		int total = 0;
		
		while(true) {
			int L = Integer.parseInt(st.nextToken()); //캠핑장 사용가능 일수
			int P = Integer.parseInt(st.nextToken()); //연속하는 일수
			int V = Integer.parseInt(st.nextToken()); //휴가기간
			
			//캠핑장은 연속하는 P일 중 L일 동안만 사용가능
			if(total > V) break;
			//?? L일 중 일부만 사용하는 경우
		}
		bw.write(max + "");
		bw.flush();
		bw.close();
	}
}
