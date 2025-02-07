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
			String s = Integer.toString(i); //비교를 위한 형변환

			//0이 아니면서 3개의 숫자가 겹치지 않는 경우 true
			if(s.charAt(0) == '0' || s.charAt(1) == '0' || s.charAt(2) == '0'
					|| s.charAt(0) == s.charAt(1) || s.charAt(0) == s.charAt(2) || s.charAt(1) == s.charAt(2)) continue;
			chk[i] = true; 
		}

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken()); //질문 
			int S = Integer.parseInt(st.nextToken()); //볼
			int B = Integer.parseInt(st.nextToken()); //스트라이크

			//영수가 생각하고 있을 가능성이 있는 답의 총 개수 구하기
			for (int k = 123; k <= 987; k++) {
				//정답 조건에 해당하는 수 탐색
				if(chk[k]) {
					int s_cnt = 0;
					int b_cnt = 0;

					//질문 수 
					for (int a = 0; a < 3; a++) {
						char n = Integer.toString(num).charAt(a);

						//정답 후보 
						for (int b = 0; b < 3; b++) {
							char m = Integer.toString(k).charAt(b);

							//숫자가 같고 위치도 같은 경우 스트라이크++
							if(n == m && a == b) {
								s_cnt++;
							}
							//숫자는 같지만 위치는 다른 경우 볼++
							else if(n == m && a != b) {
								b_cnt++;
							}
						}
					}
					//스트라이크 == 볼 -> 가능성 있는 수 
					if(s_cnt == S && b_cnt == B) chk[k] = true;
					else chk[k] = false;
				}
			}
		}
		int answer = 0;
		for (int i = 123; i <= 987; i++) {
			if(chk[i]) answer++;
		}
		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
