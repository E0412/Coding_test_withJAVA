package solution;

import java.io.*;
import java.util.*;

//영역 구하기(DFS)
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

	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken()); //세로
		N = Integer.parseInt(st.nextToken()); //가로
		K = Integer.parseInt(st.nextToken()); //직사각형 개수 


		for (int i = 0; i < K; i++) {

		}

		bw.flush();
		bw.close();
	}
}