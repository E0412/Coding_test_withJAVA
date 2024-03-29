package solution;

import java.io.*;
import java.util.*;

//6단계 법칙
/*
 * 임의의 두 사람이 몇 단계 만에 이어질 수 있는지 계산하여
 * 케빈 베이컨의 수가 가장 작은 사람을 출력 
 */
public class B_1389 {

	static final int tmp = 12345678;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N + 1][N + 1];


		//초기값 설정
		for (int i = 1; i <= N; i++) { // 1, <=
			for (int j = 1; j <= N; j++) {
				arr[i][j] = tmp;

				if(i == j) {
					arr[i][j] = 0; 
				}
			}
		}

		for (int i = 0; i < M; i++) {
			st  = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			//양방향 그래프 할당 
			arr[x][y] = arr[y][x] = 1;  
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				for (int k = 1; k <= N; k++) {
					//최단 경로 초기화
					if(arr[j][k] > arr[j][i]+ arr[i][k]) {
						arr[j][k] = arr[j][i]+ arr[i][k];
					}
				}
			}
		}

		int result = tmp;
		int person = -1;

		//케빈 베이컨의 수가 가장 작은 인덱스 탐색
		for (int i = 1; i <= N; i++) {
			int cnt = 0;
			for (int j = 1; j <= N; j++) {
				cnt += arr[i][j];
			}
			if(result > cnt) {
				result = cnt;
				person = i;
			}
		}

		bw.write(person + "\n");
		bw.flush();
		bw.close();
	}
}
