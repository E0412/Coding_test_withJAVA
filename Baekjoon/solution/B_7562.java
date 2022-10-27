package solution;

import java.io.*;
import java.util.*;

//나이트의 이동 
/*
 * 테스트 케이스, 체스판 한 변의 길이, 현재 나이트의 위치, 나이트의 이동 위치 입력
 * 각 케이스마다 나이트가 최소 몇 번만에 이동할 수 있는지 출력  
 */
public class B_7562 {

	//나이트의 이동 범위
	static int dx[] = {-2, -1, 1, 2, 2, 1, -1, -2}; 
	static int dy[] = {1, 2, 2, 1, -1, -2, -2, -1};

	public static int tc, N, total; 
	public static boolean[][] visited;
	public static int[][] graph;

	public static void BFS(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {x, y});
		visited[x][y] = true;

		while(!q.isEmpty()) {
			int point[] = q.poll();

			for (int i = 0; i < 8; i++) {
				int nx = point[0] + dx[i];
				int ny = point[1] + dy[i];

				if(!visited[nx][ny] && graph[nx][ny] == 1) {
					total++;
					visited[nx][ny] = true;
					q.offer(new int[] {nx, ny});
				}
			}
		}
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		tc = Integer.parseInt(br.readLine()); //테스트케이스 개수 


		//테스트케이스만큼 반복 
		for (int i = 0; i < tc; i++) {
			N = Integer.parseInt(br.readLine()); //나이트가 현재 있는 칸 

			visited = new boolean[N][N];
			graph = new int[N][N];


			//나이트의 위치 입력받기 
			for (int j = 0; j < tc; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());

				graph[a][b] = 1; 
			}


			bw.flush();
			bw.close();
		}
	}
}
