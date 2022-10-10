package solution;

import java.util.*;
import java.io.*;

//DFS와 BFS
/*
 * 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료
 * 간선, 정점, 시작지점 
 */
public class B_1260 {

	public static boolean[] visited;
	public static int V, E, start;
	public static int cnt;

	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

	//DFS 구현
	public static void DFS(int x) {
		
	}

	//BFS 구현 
	public static void BFS(int x) {
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i <= V; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m= Integer.parseInt(st.nextToken());
			
			//양방향 할당
			graph.get(n).add(m);
			graph.get(m).add(n);
		}

	bw.flush();
	bw.close();
	}
}
