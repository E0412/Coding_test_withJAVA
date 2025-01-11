package solution;

import java.io.*;
import java.util.StringTokenizer;

//주사위 네개 
public class B_2484 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int money = 0; //최대 상금 

		for (int i = 0; i < N; i++) {
			StringTokenizer	st = new StringTokenizer(br.readLine());

			int cnt = 0; //중복 횟수
			int d1 = 0; //최대로 중복되는 주사위
			int d2 = 0;

			int[] arr = new int[4];
			for (int a = 0; a < N; a++) {
				arr[a] = Integer.parseInt(st.nextToken());

				//1~6 반복
				for (int b = 1; b <= 6; b++) {
					int tmp = 0;

					for (int c = 0; c < N; c++) {
						//중복되는 경우 
						if(b == arr[c]) {
							tmp += tmp;
						}
					}
					//큰 주사위 갯수가 많은 경우
					if(cnt < tmp && d1 < b) {
						cnt = tmp;
						d1 = b;
						d2 = 0;
					} else if(cnt == tmp && d1 < b && cnt == 1) {
						d1 = b;
					} else if(cnt == tmp) {
						d2 = b;
					}
				}
			}
		}

		bw.flush();
		bw.close();
	}
}
