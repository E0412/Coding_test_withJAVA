package solution;

import java.io.*;
import java.util.*;

//연결 요소의 개수(BFS)
/*
 * 무방향 그래프에서의 연결요소 개수 구하기
 * BFS 풀이
 */
public class B11724 {

	static int N, M;
	static int graph[][]; //데이터 저장 그래프
	static boolean visited[]; //방문 기록 저장 배열

	//BFS 구현
	static void BFS(int x) {
		Queue<Integer> q = new LinkedList<>();
		visited[x] = true; //현재 노드 방문 저장 
		q.offer(x);

		while(!q.isEmpty()) {
			int p = q.poll();

			for (int i = 0; i < N; i++) {
				if(graph[p][i] == 0 && !visited[i]) {
					visited[i] = true;
					q.offer(i);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		graph = new int[N+1][N+1];
		visited = new boolean[N+1];


		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken()); //간선 시작점
			int end = Integer.parseInt(st.nextToken()); //간선 끝

			//무방향 그래프 할당 
			graph[start][end] = graph[end][start] = 1;
		}

		int cnt = 0;

		for (int i = 1; i < N + 1; i++) {
			//방문하지 않은 노드가 없을때까지 반복 
			if(!visited[i]) {
				cnt++;
				BFS(i);
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
