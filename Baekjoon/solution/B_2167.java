package solution;

import java.io.*;
import java.util.StringTokenizer;

//2차원 배열의 합
public class B_2167 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N + 1][M + 1];

		for (int i = 1; i <= N; i++) {
			st  = new StringTokenizer(br.readLine());
			for (int j = 1; j <= M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int K = Integer.parseInt(br.readLine());
		//배열의 합
		for (int k = 0; k < K; k++) {
			st  = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			int sum = 0;

			for (int nx = i; nx <= x; nx++) {
				for (int ny = j; ny <= y; ny++) {
					sum += arr[nx][ny];
				}
			}
			bw.write(sum + "\n");
		}
		bw.flush();
		bw.close();
	}
}
