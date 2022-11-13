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
	static int graph[][]; //토마토 판
	static Queue<int[]> q = new LinkedList<>();

	static int BFS() {

		while(!q.isEmpty()) {
			int point[] = q.poll();

			for (int i = 0; i < 4; i++) {
				int nx = point[0] + dx[i];
				int ny = point[1] + dy[i];

				if(nx >= 0 && ny >= 0 && nx < M && ny < N) {
					//토마토가 익지 않은 경우  
					if(graph[nx][ny] == 0) {
						q.offer(new int[] {nx, ny}); //익은 토마토 추가

						//날짜를 얻기 위해 전 값에서 1 증가
						graph[nx][ny] = graph[point[0]][point[1]] + 1;
					}
				}
			}
		}
		int cnt = Integer.MIN_VALUE; //최대 날짜 

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				//익지 않은 토마토가 있는 경우 -1 반환 
				if(graph[i][j] == 0) {
					return -1;
				}
				//날짜 최댓값 구하기 
				cnt = Math.max(cnt, graph[i][j]);
			}
		}
		//모두 익은 경우 0 반환
		if(cnt == 1) {
			return 0;
		} else {
			return cnt - 1; //걸린 일수 = 최대 날짜 - 1
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken()); //가로
		M = Integer.parseInt(st.nextToken()); //세로

		graph = new int[M][N];

		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			for (int j = 0; j < N; j++) {
				graph[i][j] = s.charAt(j) - '0'; 
				//토마토가 익은 경우 큐에 할당 
				if(graph[i][j] == 1) {
					q.offer(new int[] {i, j});
				}
			}
		}
		bw.write(BFS() + "");
		bw.flush();
		bw.close();
	}
}

