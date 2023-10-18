package solution;

import java.io.*;
import java.util.StringTokenizer;

//상근이의 체스판
/*
 * 흰색은 '.', 검정색은 'X'로 표시하는 체스판을 출력
 */
public class B_3076 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[R * A][C * B];
		
		for (int i = 0; i < R * A; i++) {
			for (int j = 0; j < C * B; j++) {
				char ch = '.';
				//검은 체스판
			}
		}
		
		bw.flush();
		bw.close();
	}
}
