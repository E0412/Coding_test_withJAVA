package solution;

import java.io.*;
import java.util.*;

//너비 우선 탐색 2 
//무방향 그래프 구현, 1번부터 방문 
//노드의 방문 순서를 출력, 방문할 수 없는 경우 0 출력 
public class B_24445 {

	public static boolean visited[]; //방문 여부
	public static int save[]; //순서 저장 
	public static int cnt = 1; //순서 1부터 시작
	public static int V, E, start; //정점, 간선, 시작점
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); //그래프 

	//BFS 구현 
	public static void BFS(int x) {
		Queue<Integer> q = new LinkedList<Integer>();
		save[x] = cnt++;
		visited[x] = true; 
		q.offer(x);

		while(!q.isEmpty()) {
			int y = q.poll();

			//내림차순 정렬
			Collections.sort(graph.get(y), Collections.reverseOrder());

			//정점 탐색 
			for(int ny : graph.get(y)) {  
				//해당 위치를 방문하지 않았을 때	
				if(!visited[ny]) {
					visited[ny] = true;
					save[ny] = cnt++;
					q.offer(ny);
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

		visited = new boolean[V + 1];
		save = new int[V + 1];

		//그래프 크기 할당 
		for(int i = 0; i <= V; i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			//무방향 그래프 할당 
			graph.get(a).add(b);
			graph.get(b).add(a);
		}

		BFS(start);

		//순번 저장 
		for (int i = 1; i <= V; i++) {
			bw.write(save[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
}
