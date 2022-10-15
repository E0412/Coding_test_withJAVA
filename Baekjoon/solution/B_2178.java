package solution;

import java.io.*;
import java.util.*;


//미로 탐색(BFS)
/*
 * N x M 크기의 배열로 표현되는 미로에서
 * 1은 이동, 0은 이동할 수 없는 칸
 * (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소 칸 수를 구하기
 * BFS로 푼 이유는 해당 깊이에서 갈 수 있는 탐색을 마친 후 다음으로 넘어가기 때문 
 */
public class B_2178 {

	//상하좌우를 탐색하는 배열 
	public static int[] dx = {0, 1, 0, -1};
	public static int[] dy = {1, 0, -1, 0};
	public static int N, M;
	
	public static boolean[][] visited; //방문 확인
	public static int[][] graph; //그래프
	
	//BFS 구현
	public static int BFS(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {x, y});
		
		while(!q.isEmpty()) {
			int[] pos = q.poll(); //현재 위치 
			visited[x][y] = true; 
			
			for (int i = 0; i < 4; i++) {
				int nx = pos[0] + dx[i];
				int ny = pos[1] + dy[i];
				
				//좌표 유효성 검사
				/*
				 * nx와 ny를 검사해야 하는데, x와 y를 검사하여
				 * ArrayIndexOutOfBoundsException이 발생하였다.  
				 */
				if(nx >= 0 && nx < N && ny >= 0 && ny < M) {
					//갈 수 있는 칸과 방문 여부 확인
					if(graph[nx][ny] != 0 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						//깊이 업데이트 
						graph[nx][ny] = graph[pos[0]][pos[1]] + 1;
						q.offer(new int[] {nx, ny});
					}
				}
			}
		}
		return graph[N - 1][M - 1]; //최단 거리 반환 
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		graph = new int[N][M];
		visited = new boolean[N][M];
		
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			for (int j = 0; j < M; j++) {
				graph[i][j] = Integer.parseInt(input.substring(j, j + 1));
			}
		}

		//최단 거리 반환 
		bw.write(BFS(0, 0)  + "");
		bw.flush();
		bw.close();
	}
}
