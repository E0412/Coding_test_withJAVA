package solution;

import java.io.*;
import java.util.StringTokenizer;

//음식물 피하기
public class B_1743 {

	static boolean visit[][];
	static int graph[][];
	static int dx[] = {0, 0, -1, 1};
	static int dy[] = {-1, 1, 0, 0};
	static int N, M, K;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		N = Integer.parseInt(st.nextToken()) + 1;
		M = Integer.parseInt(st.nextToken()) + 1;
		K = Integer.parseInt(st.nextToken());

		graph = new int[N][M];

		for (int i = 0; i < K; i++) {
			st  = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			graph[a][b] = 1; //그래프 할당
		}

		bw.flush();
		bw.close();
	}
}
