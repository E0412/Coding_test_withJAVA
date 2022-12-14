package solution;

import java.io.*;
import java.util.*;

//촌수계산(DFS)
/*
 * 두 사람의 촌수를 나타내는 정수를 출력
 * 두 사람의 친척 관계가 전혀 없어 촌수를 계산할 수 없을 때는 -1 출력 
 */
public class B2644 {

	static int n, m, N, M;
	static ArrayList<ArrayList<Integer>> graph; //양방향 인접리스트
	static boolean[] visited; //방문 체크
	static int result = -1; //촌수  

	static void DFS(int x, int y) {
		visited[x] = true;

		//목표에 도달한 경우 
		if(x == M) {
			result = y;
			return; 
		}

		for (int i = 1; i <= N; i++) {
			if(!visited[i]) {
				//다음 촌수로 이동
				DFS(i, y + 1);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine()); //전체 사람 수 
		visited = new boolean[n+1];
		graph = new ArrayList<ArrayList<Integer>>();
		
		//그래프 할당
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}

		//촌수를 계산해야하는 서로 다른 두 사람의 번호
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		m = Integer.parseInt(br.readLine()); //관계의 수 

		//관계의 수 할당 
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			//무방향 그래프 할당 
			graph.get(x).add(y);
			graph.get(y).add(x);
		}
		DFS(N, 0); //시작 
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
}
