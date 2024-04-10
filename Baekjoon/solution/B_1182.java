package solution;

import java.io.*;
import java.util.StringTokenizer;

//부분수열의 합
public class B_1182 {

	static int N, S, cnt;
	static int[] sub; //부분수열

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		sub = new int[N];

		st  = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			sub[i] = Integer.parseInt(st.nextToken());
		}

		//부분수열의 개수 구하기

		bw.flush();
		bw.close();
	}
}
