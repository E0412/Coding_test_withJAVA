package solution;

import java.io.*;
import java.util.*;


//유기농 배추(DFS 풀이)
/*
 * 배추가 심어진 땅 1, 없는 땅 0 배추가 있는 땅에는 배추흰지렁이가 필요 
 * 각 테스트 케이스에 대해 필요한 최소의 배추흰지렁이 마리 수를 출력
 * 첫번째 줄 = 테스트케이스 개수 / 두번째 줄 가로, 세로, 배추 개수
 */
public class B_1012 {

	public static int dx[] = {0, 0, 1, -1};
	public static int dy[] = {1, -1, 0, 0};
	
	static int T, N, M, K;
	static boolean visited[][]; //방문 체크 
	static int graph[][];
	
	//DFS 실행 
	public static void DFS(int x, int y) {
		visited[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
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
		
		T = Integer.parseInt(br.readLine()); //테스트케이스 개수 
		
		//테스트 케이스만큼 반복 
		for (int i = 0; i < T; i++) {
			
			//배추 흰지렁이 개수, 초기화 되야하는 값이기 때문에 static을 붙이면 안된다 
			int total = 0;
			
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken()); //가로
			M = Integer.parseInt(st.nextToken()); //세로
			K = Integer.parseInt(st.nextToken()); //배추

			visited = new boolean[N][M];
			graph = new int[N][M];
			
			//배추의 위치 입력받기 
			for (int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				graph[a][b] = 1; 
			}
			
			for (int x = 0; x < N; x++) {
				for (int y = 0; y < M; y++) {
					if(graph[x][y] == 1 && !visited[x][y]) {
						DFS(x, y);
						total++; 
					}
				}
			}
			bw.write(total + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
