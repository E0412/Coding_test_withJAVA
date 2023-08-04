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

		for (int i = 0; i < T; i++) {
			String tmp = br.readLine(); //빈칸 입력
			st  = new StringTokenizer(br.readLine());	
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			//가장 강한 병사의 힘을 저장
			int SJ = 0; //세준
			int SB = 0; //세비

			st  = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int sej = Integer.parseInt(st.nextToken());

				if(SJ < sej) SJ = sej; //강한 병사의 힘 저장
			}

			st  = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int seb = Integer.parseInt(st.nextToken());

				if(SB < seb) SB = seb; //강한 병사의 힘 저장
			}

			//승자 출력
			if(SJ > SB) {
				bw.write("S" + "\n");
			} else if(SJ < SB) {
				bw.write("B" + "\n");
			} else {
				bw.write("S" + "\n"); //양쪽 모두 제일 강한 병사가 있는 경우 세준이 이긴다
			}
		}
		bw.flush();
		bw.close();
	}
}
