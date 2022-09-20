package solution;

import java.io.*;
import java.util.*;

//깊이 우선 탐색 2(DFS)
//N개의 정점과 M개의 간선으로 구성된 무방향 그래프 
public class B_24480 {

	public static int[] visited; //방문한 정점
	public static int cnt; //방문 횟수
	public static int V, E, R;
	
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	//깊이 우선 탐색
	public static void DFS(int x) {
		visited[x] = cnt;
		for (int i = 0; i < graph.get(x).size(); i++) {
			int y = graph.get(x).get(i); 
			
			if(visited[y] == 0) {
				cnt++;
				DFS(y);
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		V = Integer.parseInt(st.nextToken()); //정점 
		E = Integer.parseInt(st.nextToken()); //간선
		R = Integer.parseInt(st.nextToken()); //시작 정점 
		
		visited = new int[V + 1];
		
		
	}
}
