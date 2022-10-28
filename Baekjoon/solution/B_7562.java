package solution;

import java.io.*;
import java.util.*;

//나이트의 이동(BFS) 
/*
* 테스트 케이스, 체스판 한 변의 길이, 현재 나이트의 위치, 나이트의 이동 위치 입력
* 각 케이스마다 나이트가 최소 몇 번만에 이동할 수 있는지 출력  
*/
public class B_7562 {

	//포인트 클래스 
	static class Poi {
		int x, y;

		public Poi(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}

	//나이트의 이동 범위
	static int dx[] = {-2, -1, 1, 2, 2, 1, -1, -2}; 
	static int dy[] = {1, 2, 2, 1, -1, -2, -2, -1};

	public static int x1, x2, y1, y2; //시작과 끝 좌표 
	public static int tc, N; 
	public static boolean[][] visited;
	public static int[][] graph;

	public static void BFS(Poi p) {
		Queue<Poi> q = new LinkedList<>();
		q.offer(p); //x1, y1 할당 
		visited[p.x][p.y] = true;

		while(!q.isEmpty()) {
			Poi point = q.poll();

			//도착지점에 위치한 경우 종료 
			if(point.x == x2 && point.y == y2) break;

			for (int i = 0; i < 8; i++) {
				int nx = point.x + dx[i];
				int ny = point.y + dy[i];

				if(nx >= 0 && ny >= 0 && nx < N && ny < N
						&& !visited[nx][ny]) {
					q.offer(point);
					visited[nx][ny] = true;
					graph[nx][ny] = graph[point.x][point.y] + 1;
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

			//시작 지점 
			st = new StringTokenizer(br.readLine(), " ");
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());

			//도착지점 
			st = new StringTokenizer(br.readLine(), " ");
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());

			BFS(new Poi(x1, y1));
			bw.write(graph[x2][y2] + "\n");
		}

		bw.flush();
		bw.close();
	}
}
