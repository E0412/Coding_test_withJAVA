package solution;

import java.io.*;
import java.util.StringTokenizer;

//숫자 야구 
public class B_2503 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		boolean[] chk = new boolean[988];
		//각 자리수 비교 
		for (int i = 123; i <= 987; i++) {
			String s = String.valueOf(i); //비교를 위한 형변환

			//0이 아니면서 3개의 숫자가 겹치지 않는 경우 true
			if(s.charAt(0) == '0' || s.charAt(1) == '0' || s.charAt(2) == '0'
					|| s.charAt(0) == s.charAt(1) || s.charAt(0) == s.charAt(2) || s.charAt(1) == s.charAt(2)) {
				chk[i] = true; 
			}
		}

		int num = 0; //질문 
		int b = 0; //볼
		int s = 0; //스트라이크

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			num = Integer.parseInt(st.nextToken());
			s = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());

			int b_cnt = 0;
			int s_cnt = 0;

			//영수가 생각하고 있을 가능성이 있는 답의 총 개수 구하기
			for (int k = 123; k <= 987; k++) {
				//정답 조건에 해당하는 수 탐색
				if(chk[k]) {

				}
			}
		}

		bw.flush();
		bw.close();
	}
}
