package solution;

import java.io.*;
import java.util.*;

//촌수계산(BFS)
/*
 * 두 사람의 촌수를 나타내는 정수를 출력
 * 두 사람의 친척 관계가 전혀 없어 촌수를 계산할 수 없을 때는 -1 출력 
 */
public class B_2644 {

	static int n, m, N, M;
	static ArrayList<ArrayList<Integer>> graph; //이중 ArrayList
	static boolean[] visited; //방문 체크
	static int result = -1; //촌수 계산 변수 

	static void BFS(int x, int y) {
		Queue<Integer> q = new LinkedList<Integer>();
		//한 점에서 시작한다 
		q.offer(x); 

		while(!q.isEmpty()) {
			int size = q.size();

			//큐에 할당된 크기만큼 반복 
			for (int k = 0; k < size; k++) {
				int point = q.poll();
				visited[point] = true; //방문 처리

				for (int i : graph.get(x)) {
					if(!visited[i]) {
						//끝점과 만나면 결과 반환 
						if(point == M) {
							result = y + 1;
						}
						q.offer(i);
					}
					result++;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine()); //전체 사람 수 

		graph = new ArrayList<ArrayList<Integer>>();
		visited = new boolean[n+1];

		//그래프 할당
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
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
		BFS(N, 0);
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
}
