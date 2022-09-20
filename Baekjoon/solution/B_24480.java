package solution;

import java.io.*;
import java.util.*;

//깊이 우선 탐색 2(DFS)
//N개의 정점과 M개의 간선으로 구성된 무방향 그래프 
public class B_24480 {

	public static int[] visited; //방문한 정점
	public static int cnt; //방문 횟수
	public static int V, E, start;
	
	//2차원 ArrayList 활용 
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	//깊이 우선 탐색
	public static void DFS(int x) {
		visited[x] = cnt; //방문한 정점에 순서 저장 
		
		for (int i = 0; i < graph.get(x).size(); i++) {
			int y = graph.get(x).get(i); 
			
			//방문 여부 확인 
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
		start = Integer.parseInt(st.nextToken()); //시작 정점 
		
		visited = new int[V + 1]; //index 1부터 시작 
		cnt = 1; //시작 정점 = 1 -> 초기값 1로 할당 
		
		for (int i = 0; i < V + 1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
		
		//무방향 그래프 -> 양쪽 모두 추가
			graph.get(from).add(to);
			graph.get(to).add(from);
		}
		
		DFS(start); 
		
		for (int i = 1; i < visited.length; i++) {
			bw.write(visited[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
}
