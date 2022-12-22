package solution;

import java.io.*;
import java.util.*;

//경로 찾기
/*
 * 가중치 없는 방향 그래프 G가 주어졌을 때, 
 * 모든 정점 (i, j)에 대해서, i에서 j로 가는 경로가 있는지 없는지 구하는 프로그램을 작성
 * i번째 줄의 j번째 숫자가 1인 경우에는 i에서 j로 가는 간선이 존재, 0인 경우는 없다
 */
public class B_11403 {

	static int N;
	static int[][] graph;
	static boolean[] visited;

	//BFS 실행
	static void BFS() {
		for (int i = 0; i < N; i++) {
			Queue<Integer> q = new LinkedList<Integer>();
			q.offer(i);

			while(!q.isEmpty()) {
				int point = q.poll();

				for (int k = 0; k < N; k++) {
					if(graph[point][k] == 1 && !visited[k]) {
						visited[k] = true;
						graph[i][k] = 1;
						q.offer(k);
					}
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());

		graph = new int[N][N];
		visited = new boolean[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			graph[a][b] = graph[b][a] = 1; 
		}

		BFS();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				bw.write(graph[i][j] + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}


