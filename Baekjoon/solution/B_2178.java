package solution;

import java.io.*;
import java.util.*;


//미로 탐색(BFS)
/*
 * N x M 크기의 배열로 표현되는 미로에서
 * 1은 이동, 0은 이동할 수 없는 칸
 * (1, 1)에서 출발하여 (N, M)의 위치로 이동할 때 지나야 하는 최소 칸 수를 구하기
 */
public class B_2178 {

	//상하좌우를 탐색하는 배열 
	public static int[] dx = {0, 1, 0, -1};
	public static int[] dy = {1, 0, -1, 0};
	public static int N, M;
	
	public static boolean[][] visited; //방문 확인
	//그래프
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
	//BFS 구현
	public static void BFS(int x, int y) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(graph.get(x).get(y));
		
		while(!q.isEmpty()) {
			
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visited = new boolean[N][M];
		
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < M; i++) {
			
		}
		
		
		bw.flush();
		bw.close();
	}
}
