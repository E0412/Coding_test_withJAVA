package solution;

import java.io.*;
import java.util.StringTokenizer;

//기상청 인턴 신현수
public class B_2435 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max = Integer.MIN_VALUE;

		//온도의 수열에서 연속적인 K일의 온도의 합이 최대가 되는 값 출력
		for (int i = 0; i <= N - K; i++) {
			int cnt = 0;
			for (int j = 0; j < K; j++) {
				cnt += arr[i + j];
			}
			if(cnt > max) {
				max = cnt;
			}
		}
		bw.write(max + "");
		bw.flush();
		bw.close();
	}
}
