package solution;

import java.io.*;
import java.util.*;

//섬의 개수(DFS 풀이)
/*
 * 섬과 바다 지도가 주어질 때 각 테스트케이스의 섬의 개수를 센다
 * 너비 w 높이 h, 연결되어 있으면 섬 
 * 1은 땅 0은 바다 입력의 마지막 줄에는 0이 두 개 주어진다.
 */
public class B4963 {

	//상하좌우, 대각선  
	static int dx[] = {-1, 0, 1, -1, 1, -1, 0, 1};
	static int dy[] = {-1, -1, -1, 0, 0, 1, 1, 1};

	static int graph[][];
	static boolean visited[][]; //체크 방문시 1로 변경 

	static int W, H; //너비, 높이

	static void DFS(int x, int y ) {
		visited[x][y] = true;

		//탐색 
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if(nx >= 0 && ny >= 0 && nx < H && ny < W) {
				if(!visited[nx][ny] && graph[nx][ny] == 1) {
					DFS(nx, ny);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		//테스트 케이스만큼 반복 
		while(true) {
			st = new StringTokenizer(br.readLine());

			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());

			if(W == 0 && H == 0) break;

			int cnt = 0;
			graph = new int[H][W];
			visited = new boolean[H][W];

			for (int i = 0; i < H; i++) {
				st = new StringTokenizer(br.readLine());

				for (int j = 0; j < W; j++) {
					graph[i][j] = Integer.parseInt(st.nextToken()); 
				}
			}

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if(!visited[i][j] && graph[i][j] == 1) {
						DFS(i, j);
						cnt++;
					}
				}
			}
			bw.write(cnt + "\n");
		}
		bw.flush(); //break가 없으면 오류 
		bw.close();
	}
}
