package solution;

import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

//너비 우선 탐색 2 
//무방향 그래프 구현, 1번부터 방문 
//노드의 방문 순서를 출력, 방문할 수 없는 경우 0 출력 
public class B_24445 {

	public static int visited[]; //방문 여부
	public static int V, E, start; //정점, 간선, 시작점
	public static int[][] graph; //그래프 
	public static int cnt = 1; //방문 순서 
	//ArrayList로 2차원 배열로 바꿔보기
	
	public static void BFS(int x) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(x);
		visited[x] = cnt; //방문한 정점에 순서 저장
		
		while(!q.isEmpty()) {
			int y = q.poll();
			cnt++;
			visited[y] = cnt;
			
			for(int i = 1; i <= V; i++) {  
			//해당 위치를 방문하지 않았을 때	
			if(graph[x][i] == 1 && visited[i] == 0) {
					q.offer(i);
					visited[i] = cnt;
			}
			}
		}
	}
	
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		
		graph = new int[V + 1][V + 1];
		visited = new int[V + 1];
		
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			graph[a][b] = graph[b][a] = 1; 
		}
		BFS(start);
		
		Arrays.sort(visited);
		for (int i = 1; i <= V; i++) {
			bw.write(visited[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
}
