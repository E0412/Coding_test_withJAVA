package solution;

import java.io.*;
import java.util.*;

//경로 찾기
/*
 * 가중치 없는 방향 그래프 G가 주어졌을 때, 
 * 모든 정점 (i, j)에 대해서, i에서 j로 가는 경로가 있는지 없는지 구하는 프로그램을 작성
 * i번째 줄의 j번째 숫자가 1인 경우에는 i에서 j로 가는 간선이 존재, 0인 경우는 없다
 */
public class B11403 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[][] graph = new int[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < N; i++) {
			for (int n = 0; n < N; n++) {
				for (int m = 0; m < N; m++) {
					//경로 체크
					if(graph[n][i] == 1 && graph[i][m] == 1) {
						graph[n][m] = 1; 
					}
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				bw.write(graph[i][j] + " ");
			}
			bw.write("\n");
		}

		bw.flush();
		bw.close();
	}
}
