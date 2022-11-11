package solution;

import java.io.*;
import java.util.*;

//토마토(BFS)
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

	static void BFS(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {x, y});
		visited[x][y] = true;

		while(!q.isEmpty()) {
			int point[] = q.poll();

			for (int i = 0; i < 4; i++) {
				int nx = point[0] + dx[i];
				int ny = point[1] + dy[i];

				if(nx >= 0 && ny >= 0 && nx < M && ny < N) {
					if(!visited[nx][ny] && graph[nx][ny] == 1) {
						q.offer(new int[] {nx, ny});
						cnt++;
					}
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken()); //가로
		M = Integer.parseInt(st.nextToken()); //세로

		graph = new int[M][N];
		visited = new boolean[M][N];

		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			for (int j = 0; j < N; j++) {
				graph[i][j] = s.charAt(j) - '0'; 
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				BFS(i, j);
			}
		}

		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
