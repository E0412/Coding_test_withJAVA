package solution;


import java.io.*;
import java.util.*;


//영역구하기(BFS)
/*
 * M, N과 K 그리고 K개의 직사각형의 좌표가 주어질 때, 
 * K개의 직사각형 내부를 제외한 나머지 부분의 영역의 개수와 
 * 분리된 각 영역의 넓이를 구해야한다 
 */
public class B2583 {

	static int M, N, K; 

	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};

	static int graph[][]; 
	static boolean visited[][]; //방문 확인 

	static int cnt; //영역의 개수 

	//BFS 실행 
	static void BFS(int x, int y) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[] {x, y});
		visited[x][y] = true; 
		cnt = 1;
		
		while(!q.isEmpty()) {
			int[] p = q.poll();

			for (int i = 0; i < 4; i++) {
				int nx = p[0] + dx[i];
				int ny = p[1] + dy[i];

				if(nx >= 0 && ny >= 0 && nx < M && ny < N) {
					if(!visited[nx][ny] && graph[nx][ny] == 0) {
						cnt++;
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
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken()); //세로
		N = Integer.parseInt(st.nextToken()); //가로
		K = Integer.parseInt(st.nextToken()); //직사각형 개수 

		graph = new int[M][N];
		visited = new boolean[M][N];

		ArrayList<Integer> list = new ArrayList<Integer>(); //영역 넓이 저장 


		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());

			for (int a = y1; a < y2; a++) {
				for (int b = x1; b < x2; b++) {
					graph[a][b] = 1; //방문 처리  
				}
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if(graph[i][j] == 0 && !visited[i][j]) {
					BFS(i, j);
					list.add(cnt);
				}
			}
		}

		bw.write(list.size() + "\n");

		Collections.sort(list);

		for(Integer result : list) {
			bw.write(result + " ");
		}
		bw.flush();
		bw.close();
	}
}
