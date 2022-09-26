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
	public static int check[][]; //방문여부 0이면 방문x
	public static int cnt = 1;
	
	public static void DFS(int x, int y) {
		check[x][y] = 1; //방문으로 변경 
		
		cnt++;
		
		if(graph[x][y] == 0) {
			
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		
		graph = new int[N][N];
		check = new int[N][N];
		
		//그래프 할당 
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			graph[x][y] = graph[y][x] = 1;   
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				DFS(i, j);
			}
		}
		
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
