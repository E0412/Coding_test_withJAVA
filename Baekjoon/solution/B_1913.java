package solution;

import java.io.*;

//달팽이
public class B_1913 {

	static int N, M;
	static int dx[] = {1, 0, -1, 0};
	static int dy[] = {0, 1, 0, -1};
	static int graph[][];

	static void search() {
		int po = 0; //현재 위치 
		int r = 0; //시작좌표
		int c = 0;

		graph[r][c] = N * N; 

		while(po < 4) {
			int nx = r + dx[po];
			int ny = c + dy[po];

			//수를 넣지 않은 좌표인 경우
			if(nx >= 0 && nx < N && ny >= 0 && ny < N && graph[nx][ny] == 0) {
				//이전 좌표의 수보다 1 작은 값을 할당한다
				graph[nx][ny] = graph[r][c] - 1;

				if(graph[nx][ny] == 1) { //종료조건
					break;
				}
				r = nx;
				c = ny;
			} else { //범위를 벗어났거나 이미 수를 넣은 좌표
				po++;
			}
			if(po >= 4) po = 0; //4를 넘어가면 0으로 초기화한다
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine()); 
		M = Integer.parseInt(br.readLine()); //찾아야 하는 수
		graph = new int[N][N];

		search();

		//찾아야 하는 좌표 변수

		bw.flush();
		bw.close();
	}
}
