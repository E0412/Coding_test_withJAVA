package solution;

import java.io.*;
import java.util.*;

//나이트의 이동 
public class B_7562 {

	public static int tc, N; 
	public static boolean[][] visited;
	public static int[][] graph;

	public static void DFS(int x) {

	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		tc = Integer.parseInt(br.readLine()); //테스트케이스 개수 


		//테스트케이스만큼 반복 
		for (int i = 0; i < tc; i++) {
			N = Integer.parseInt(br.readLine()); //나이트가 현재 있는 칸 

			visited = new boolean[N][N];
			graph = new int[N][N];


			//나이트의 위치 입력받기 
			for (int j = 0; j < tc; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());

				graph[a][b] = 1; 
			}


			bw.flush();
			bw.close();
		}
	}
}
