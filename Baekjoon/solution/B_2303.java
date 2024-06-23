package solution;

import java.io.*;
import java.util.StringTokenizer;

//숫자 게임
public class B_2303 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st;

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[5];
		int[] card = new int[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			int max = Integer.MIN_VALUE;

			//세 장의 카드를 골라 합을 구한 후 일의 자리 수가 가장 큰 사람 출력
			for (int a = 0; a < 3; a++) {
				for (int b = a + 1; b < 4; b++) {
					for (int c = b + 1; c < 5; c++) {
						max = Math.max(max, (arr[a] + arr[b] + arr[c]) % 10);
					}
				}
			}
			card[i] = max;
		}
		int idx = 0;
		int ans = 0;

		for (int i = 0; i < N; i++) {
			if(ans <= card[i]) {
				ans = card[i];
				idx = i + 1;
			}
		}
		bw.write(idx + "");
		bw.flush();
		bw.close();
	}
}
