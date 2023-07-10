package solution;

import java.io.*;
import java.util.StringTokenizer;

//기숙사 바닥
public class B_2858 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int R = Integer.parseInt(st.nextToken()); //빨간색 타일 -> 가장자리
		int B = Integer.parseInt(st.nextToken()); //갈색 타일 수 -> 안의 크기

		//방의 크기 
		int L = 0; 
		int W = 0;  

		for (L = 1; L < R; L++) {
			for (W = 1; W < R; W++) {
				if((L * 2) + (W - 2) * 2 == R && (L - 2) * (W - 2) == B) {
					bw.write(W + " " + L);
					return;
				}
			}
		}
		bw.flush();
		bw.close();
	}
}