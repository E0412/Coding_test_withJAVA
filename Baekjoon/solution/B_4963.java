package solution;

import java.io.*;
import java.util.*;

//섬의 개수(BFS)
/*
 * 섬과 바다 지도가 주어질 때 각 테스트케이스의 섬의 개수를 센다
 * 50보다 작거나 같은 양의 정수 너비 w 높이 h
 * 1은 땅 0은 바다 입력의 마지막 줄에는 0이 두 개 주어진다.
 */
public class B_4963 {

	static int graph[][];
	static boolean visited[][];

	static int W, H;


	static void BFS(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {x, y});
		int cnt = 0; //섬의 개수 

		while(!q.isEmpty()) {
			int[] point = q.poll();

		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		//테스트 케이스만큼 반복 
		for (int i = 0; i < 7; i++) {
			st = new StringTokenizer(br.readLine());

			int W = Integer.parseInt(st.nextToken());
			int H = Integer.parseInt(st.nextToken());


		}
		
		bw.flush();
		bw.close();
	}
}

