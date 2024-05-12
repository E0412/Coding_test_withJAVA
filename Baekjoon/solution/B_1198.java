package solution;

import java.io.*;
import java.util.StringTokenizer;

//삼각형으로 자르기 
public class B_1198 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[][] p = new int[N][2]; //점
		double max = 0; //넓이의 최댓값

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			p[i][0] = Integer.parseInt(st.nextToken());
			p[i][1] = Integer.parseInt(st.nextToken());
		}

		bw.flush();
		bw.close();
	}
}
