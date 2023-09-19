package solution;

import java.io.*;
import java.util.StringTokenizer;

//음식물 피하기
public class B_1743 {

	static boolean visited[][];
	static int graph[][];
	static int dx[] = {0, 0, -1, 1};
	static int dy[] = {-1, 1, 0, 0};
	static int N, M, K, result;

	static void DFS(int x, int y) {

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		N = Integer.parseInt(st.nextToken()) + 1;
		M = Integer.parseInt(st.nextToken()) + 1;
		K = Integer.parseInt(st.nextToken());

		graph = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < K; i++) {
			st  = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			graph[a][b] = 1; //그래프 할당
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(!visited[i][j] && graph[i][j] == 1) {
					int cnt = 0;
					DFS(i, j);
					result = Math.max(result, cnt);
				}
			}
		}
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
}
