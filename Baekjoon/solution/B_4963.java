package solution;

import java.io.*;
import java.util.*;


//섬의 개수(BFS)
/*
 * 섬과 바다 지도가 주어질 때 각 테스트케이스의 섬의 개수를 센다
 * 너비 w 높이 h, 연결되어 있으면 섬 
 * 1은 땅 0은 바다 입력의 마지막 줄에는 0이 두 개 주어진다.
 */
public class B_4963 {

	//상하좌우, 대각선  
	static int dx[] = {-1, 0, 1, -1, 1, -1, 0, 1};
	static int dy[] = {-1, -1, -1, 0, 0, 1, 1, 1};

	static int graph[][];
	static boolean visited[][]; //체크 방문시 1로 변경 

	static int W, H; //너비, 높이, 


	static void BFS(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		visited[x][y] = true;
		q.offer(new int[] {x, y});


		while(!q.isEmpty()) {
			int[] point = q.poll();

			for (int i = 0; i < 8; i++) {
				int nx = point[0] + dx[i];
				int ny = point[1] + dy[i];


				if(nx >= 0 && ny >= 0 && nx < H && ny < W) {
					if(!visited[nx][ny] && graph[nx][ny] == 1) {
						visited[nx][ny] = true;
						q.offer(new int[] {nx, ny});
					}
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

			//입력을 int W로 받아서 cnt가 제대로 출력되지 않았음 
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());

			if(W == 0 && H == 0) break;

			int cnt = 0; //섬의 개수 초기화

			graph = new int[H][W]; //높이x너비로 구성 
			visited = new boolean[H][W];

			//지도 입력 
			for (int n = 0; n < H; n++) {
				st = new StringTokenizer(br.readLine());

				for (int m = 0; m < W; m++) {
					graph[n][m] = Integer.parseInt(st.nextToken());
				}
			}

			for (int n = 0; n < H; n++) {
				for (int m = 0; m < W; m++) {
					if(graph[n][m]== 1 && !visited[n][m]) {
						BFS(n, m);
						cnt++;
					}
				}
			}
			bw.write(cnt + "\n");
		}
		bw.flush();
		bw.close();
	}
}
