package solution;

import java.io.*;
import java.util.*;

//영역구하기(DFS)
/*
 * M, N과 K 그리고 K개의 직사각형의 좌표가 주어질 때, 
 * K개의 직사각형 내부를 제외한 나머지 부분의 영역의 개수와 
 * 분리된 각 영역의 넓이를 구해야한다 
 */
public class B_2583 {

	static int M, N, K; 

	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};

	static int graph[][]; 

	static int cnt; //영역의 개수 

	static void DFS(int x, int y) {
		graph[x][y] = 1; 
		cnt++; //영역의 넓이 ++ 

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if(nx >= 0 && ny >= 00 && nx < M && ny < N) {
				//방문하지 않았을 때
				if(graph[nx][ny] == 0) {
					DFS(nx, ny); //DFS 실행 
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

		ArrayList<Integer> list = new ArrayList<Integer>(); //영역 넓이 저장 

		//영역 입력받기 
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			//왼쪽 아래 x, y 좌표
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			//오른쪽 위 x, y 좌표
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());

			//방문처리 
			for (int n = y1; n < y2; n++) {
				for (int m = x1; m < x2; m++) {
					graph[n][m] = 1;
				}
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				//방문 x
				if(graph[i][j] == 0) {
					cnt = 0;
					DFS(i, j);
					list.add(cnt);
				}
			}
		}

		bw.write(list.size() + "\n"); //영역의 개수

		Collections.sort(list); //정렬 

		//각 영역의 넓이
		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i) + " ");
		}

		bw.flush();
		bw.close();
	}
}
