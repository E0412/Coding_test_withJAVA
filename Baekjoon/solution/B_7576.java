package solution;

import java.io.*;
import java.util.*;

//토마토(DFS)
/*
 * 토마토가 익는 최소 일수, 인접한 토마토만 익는다 
 * 1은 익은 토마토, 0은 익지않은 토마토, -1은 빈칸 
 * 모두 익은 경우 0 모두 익지 못하는 경우 -1 출력
 */
public class B_7576 {

	//상하좌우 이동 
	public static int dx[] = {0, 0, 1, -1};
	public static int dy[] = {1, -1, 0, 0};

	static int N, M;
	static int cnt = 0; 
	static boolean visited[][]; //방문 체크 
	static int graph[][];

	static void DFS(int x, int y) {
		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
				if(!visited[nx][ny] && graph[nx][ny] == 1) {
					DFS(nx, ny);
					cnt++;
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

		graph = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				graph[i][j] = s.charAt(j) - '0'; 
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				DFS(i, j);
			}
		}

		bw.write(cnt);
		bw.flush();
		bw.close();
	}
}
