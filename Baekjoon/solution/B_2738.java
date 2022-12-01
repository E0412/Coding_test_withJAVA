package solution;

import java.io.*;
import java.util.*;

//행렬덧셈(2차원 배열)
/*
 * N * M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성
 */
public class B_2738 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int A[][] = new int[N][M];
		int B[][] = new int[N][M];

		//배열 할당 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		//배열 할당 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				B[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}

		//인덱스의 합 
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int result = A[i][j] + B[i][j];
				bw.write(result + " ");

				//행렬 줄바꿈 
				if(j == M -1) {
					bw.write("\n");
				}
			}
		}
		bw.flush();
		bw.close();
	}
}
