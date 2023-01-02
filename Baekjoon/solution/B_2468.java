package solution;

import java.io.*;
import java.util.*;

//안전 영역(DFS)
/*
 * 어떤 지역의 높이 정보가 주어졌을 때, 장마철에 물에 잠기지 않는 안전한 영역의 최대 개수를 계산
 * 안전한 영역은 물에 잠기지 않는 지점들이 위, 아래, 오른쪽 혹은 왼쪽으로 인접하고 그 크기가 최대인 영역
 */
public class B_2468 {

	static int N; 
	static int[][] graph; //2차원 배열 지도
	static int[][] map; //변형 된 지도 
	static boolean[][] visited;
	static int dx[] = {1, 0, -1, 0};
	static int dy[] = {0, -1, 0, 1};


	static void DFS(int x, int y) {
		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
				if(!visited[nx][ny] && map[nx][ny] == 1) {
					DFS(nx, ny);
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


		//2차원 배열 입력 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}

		int max = 1; //최댓값

		for (int h = 1; h < 101; h++) {
			map = new int[N][N];
			visited = new boolean[N][N];

			int cnt = 0; //안전 지역 개수 

			for (int n = 0; n < N; n++) {
				for (int m = 0; m < N; m++) {
					//높이 이하면 0으로 저장
					if(graph[n][m] <= h) {
						map[n][m] = 0; 
					} 
					//아닌경우 1로 저장 
					else map[n][m] = 1; 
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(map[i][j] == 1 && !visited[i][j]) {
						DFS(i, j);
						cnt++;
					}
				}
			}
			max = Math.max(max, cnt); //둘 중 큰 수를 저장 
		}
		bw.write(max + "");
		bw.flush();
		bw.close();
	}
}
