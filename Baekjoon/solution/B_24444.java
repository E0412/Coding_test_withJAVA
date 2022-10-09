package solution;

import java.io.*;
import java.util.*;

//너비 우선 탐색 1 
//무방향 그래프 구현, 1번부터 방문 
//노드의 방문 순서를 출력, 방문할 수 없는 경우 0 출력 
public class B_24444 {

	public static boolean[] visited;
	public static int[] save;
	public static int V, E, start;
	public static int cnt = 1;
	
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
	public static void BFS(int x) {
		Queue<Integer> q = new LinkedList<Integer>();
		visited[x] = true;
		save[x] = cnt++;
		q.offer(x);
		
		while(!q.isEmpty()) {
			int y = q.poll();
			
			Collections.sort(graph.get(y)); //poll된 순서대로 오름차순 정렬
			
			for(int ny : graph.get(y)) {
				if(!visited[ny]) {
					visited[ny] = true;
					save[ny] = cnt++;
					q.offer(ny);
				}
			}
		}
	}
	
	public static void main(String[] args)  throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		
		visited = new boolean[V + 1];
		save = new int[V + 1];
		
		//그래프 할당 
		for (int i = 0; i <= V; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			graph.get(n).add(m);
			graph.get(m).add(n);
		}
		
		BFS(start);
		
		for (int i = 1; i <= V; i++) {
			bw.write(save[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
}
