package solution;

import java.io.*;
import java.util.*;


//유기농 배추(DFS 풀이)
/*
 * 배추가 심어진 땅 1, 없는 땅 0 배추가 있는 땅에는 배추흰지렁이가 필요 
 * 각 테스트 케이스에 대해 필요한 최소의 배추흰지렁이 마리 수를 출력
 * 첫번째 줄 = 테스트케이스 개수 / 두번째 줄 가로, 세로, 배추 개수
 */
public class B_1012 {

	public static int dx[] = {0, 0, 1, -1};
	public static int dy[] = {1, -1, 0, 0};
	
	static int T, N, M, K;
	static int total; //배추흰지렁이 개수
	static boolean visited[][]; //방문 체크 
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
	public static void DFS(int x, int y) {
		
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		T = Integer.parseInt(br.readLine()); //테스트케이스 개수 
		
		N = Integer.parseInt(st.nextToken()); //가로
		M = Integer.parseInt(st.nextToken()); //세로
		K = Integer.parseInt(st.nextToken()); //배추
		
		visited = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			graph.add(new ArrayList<>());
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				DFS(i, j);
			}
		}
		
		bw.flush();
		bw.close();
	}
}

