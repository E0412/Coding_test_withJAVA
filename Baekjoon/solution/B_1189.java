package solution;

import java.io.*;
import java.util.StringTokenizer;

//컴백홈
public class B_1189 {

	static int R, C, K, cnt;
	static char[][] map;
	static int[][] visited;
	static int[] dx = {-1, 0, 0, 1};
	static int[] dy = {0, 1, -1, 0};

	//한수가 집까지 도착하는 경우 중 거리가 K인 가짓수 구하기
	static void DFS(int x, int y , int z) {
		if(x == 0 && y == C - 1) { 
			if(z == K) cnt++; //경우의 수 추가
			return;
		}

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if(nx >= R || nx < 0 || ny >= C || ny < 0 || 
					visited[nx][ny] == 1 || map[nx][ny] =='T') continue;
			visited[nx][ny] = 1;
			DFS(nx, ny, z + 1);
			visited[nx][ny] = 0;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st = new StringTokenizer(br.readLine());

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		map = new char[R][C];
		visited = new int[R][C];

		for (int i = 0; i < R; i++) {
			String s = br.readLine();
			for (int j = 0; j < C; j++) {
				map[i][j] = s.charAt(j); 
			}
		}

		visited[R - 1][0] = 1;
		DFS(R - 1, 0, 1);

		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
