package solution;

import java.io.*;
import java.util.StringTokenizer;

//거리의 합
public class B_2399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] x = new int[N];

		StringTokenizer	st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			x[i] = Integer.parseInt(st.nextToken());
		}

		long answer = 0;
		//모든쌍의 거리를 더한 값 구하기
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				answer += Math.abs(x[i] - x[j]); //|x[i] - x[j]|의 합
			}
		}
		bw.write(answer + "");
		bw.flush();
		bw.close();
	}
}
