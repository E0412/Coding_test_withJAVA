package solution;

import java.io.*;
import java.util.*;

//안전 영역
/*
 * 어떤 지역의 높이 정보가 주어졌을 때, 장마철에 물에 잠기지 않는 안전한 영역의 최대 개수를 계산
 * 안전한 영역 == 물에 잠기지 않는 지점들이 위, 아래, 오른쪽 혹은 왼쪽으로 인접하고 그 크기가 최대인 영역
 */
public class B_2468 {

	static int N; 
	static int[][] graph;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		graph = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		
		bw.flush();
		bw.close();
	}
}
