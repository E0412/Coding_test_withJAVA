package solution;

import java.io.*;
import java.util.*;

//바이러스(DFS)
/*
 * 기준이 되는 컴퓨터에 연결된 컴퓨터는 감염
 * 연결되지 않은 컴퓨터는 영향을 받지 않는다 
 * 컴퓨터의 수, 연결된 컴퓨터 쌍의 수가 주어진다 
 */
public class B_2606 {

	public static int graph[][];
	public static int N, M; //입력
	public static boolean check[]; //방문여부
	public static int result = 0; //감염된 컴퓨터 수 
	
	public static void DFS(int x ) {
		check[x] = true; //방문으로 변경 
		result++;
		
		for (int i = 0; i < M; i++) {
			//연결된 정점이면서 방문하지 않았을 때 
			if(graph[x][i] == 1 && !check[i]) {
				DFS(i);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine()); //정점
		M = Integer.parseInt(br.readLine()); //간선
		
		graph = new int[N][N];
		check = new boolean[N];
		
		//연결정보 저장, 1부터 시작
		for (int i = 1; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			graph[x][y] = graph[y][x] = 1; //무방향 그래프 할당
		}
		DFS(1); //DFS 수행 
		
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
}

