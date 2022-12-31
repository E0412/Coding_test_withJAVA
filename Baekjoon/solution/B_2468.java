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
		
		int N = Integer.parseInt(br.readLine());
		graph = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		
		bw.flush();
		bw.close();
	}
}
