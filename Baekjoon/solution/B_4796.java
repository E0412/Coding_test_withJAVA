package solution;

import java.io.*;
import java.util.StringTokenizer;

//캠핑
public class B_4796 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int max = 1;
		int total = 0;

		while(true) {
			StringTokenizer st  = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken()); //캠핑장 사용가능 일수
			int P = Integer.parseInt(st.nextToken()); //연속하는 일수
			int V = Integer.parseInt(st.nextToken()); //휴가기간

			total = L + P + V;
			if(total == 0) break;

			//이용할 수 있는 최대 기간
			total = L * (V / P) + Math.min(L, V % P);
			bw.write("Case " + max + ": " + total + "\n");
			max++;
		}
		bw.flush();
		bw.close();
	}
}
