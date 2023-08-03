package solution;

import java.io.*;
import java.util.StringTokenizer;

//세준세비
/* 한 줄에 하나씩 차례대로 승자를 출력
 * 세준이가 이기면 S를 세비가 이기면 B를 둘다 아닐 경우에는 C를 출력
 */
public class B_1524 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		st  = new StringTokenizer(br.readLine());	
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int S = 0; //세준
			int B = 0; //세비

			if(S > B) {
				bw.write("S");
			} else if(S < B) {
				bw.write("B");
			} else {
				bw.write("C");
			}
		}

		bw.flush();
		bw.close();
	}
}
