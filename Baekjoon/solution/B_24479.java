package solution;

import java.io.*;
import java.util.*;

//깊이 우선 탐색 1(DFS)
//오름차순 정렬
public class B_24479 {
	public static int V, E, start;
	public static int visited[];
	public static int cnt;

	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

	public static void DFS(int n) {
		visited[n] = cnt;

		for (int i = 0; i < graph.get(n).size(); i++) {
			int m = graph.get(n).get(i);

			//방문 여부 확인 
			if(visited[m] == 0) {
				cnt++;
				DFS(m);
			}
		}
	}

	public static void main(String[] args) throws IOException{
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

		//오름차순 정렬
		for (int i = 1; i < graph.size(); i++) {
			Collections.sort(graph.get(i));
		}

		DFS(start); 

		for (int i = 1; i < visited.length; i++) {
			bw.write(visited[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
}
