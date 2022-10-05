package solution;

import java.io.*;
import java.util.*;

//너비 우선 탐색 2 
//무방향 그래프 구현, 1번부터 방문  
public class B_24445 {

	public static boolean visited[]; //방문 여부
	public static int V, E, start; //정점, 간선, 시작점
	public static int[][] graph; //그래프 
	public static int cnt = 1; //방문 순서 

	
	public void BFS(int x) {
		Queue<Integer> q = new LinkedList<Integer>();
		visited[x] = true;
		q.offer(x);
		
		while(!q.isEmpty()) {
			int y = q.poll();
			System.out.print(y + " ");
			
			for(int ny : graph[x]) {
			//해당 위치를 방문하지 않았을 때	
			if(visited[ny] == false) {
					visited[ny] = true;
					q.offer(ny);
			}
			}
		}
	}
	
	public static void main(String[] args) throws IOException { 
		B_24445 T = new B_24445();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		
		graph = new int[V][V];
		visited = new boolean[V];
		
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			graph[a][b] = graph[b][a] = 1; 
		}
		T.BFS(1);
	}
}