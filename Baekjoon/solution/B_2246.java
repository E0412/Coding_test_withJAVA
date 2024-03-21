package solution;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

//콘도 선정
public class B_2246 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		int D[] = new int[N];
		int C[] = new int[N];

		//값을 비교하기 어려워서 HashMap 삭제 -> 배열 사용
		for (int i = 0; i < N; i++) {
			StringTokenizer st  = new StringTokenizer(br.readLine());
			D[i] = Integer.parseInt(st.nextToken()); //콘도~바닷가 거리
			C[i] = Integer.parseInt(st.nextToken()); //숙박비
		}

		/* X보다 바닷가에 더 가까운 콘도들은 모두 X보다 숙박비가 더 비싸다.
		 * X보다 숙박비가 더 싼 콘도들은 모두 X보다 바닷가에서 더 멀다.
		 */
		for (int X = 0; X < N; X++) {
			boolean check = true;
			for (int j = 0; j < N; j++) {
				if(X == j) continue;
				//조건을 만족하지 않은경우
				if(D[X] >= D[j] && C[X] >= C[j]) {
					check = false;
					continue;
				}
			}
			if(check) cnt++;
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
