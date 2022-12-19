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
	static int[] cnt; 
	static int result = -1; //촌수 계산 변수 

	static int BFS(int x) {
		Queue<Integer> q = new LinkedList<Integer>();
		//한 점에서 시작한다 
		cnt[x] = 0;
		q.offer(x);

		while(!q.isEmpty()) {
			//확인할 사람은 큐에서 제외
			int point = q.poll();

			//비교대상을 찾으면 촌수 저장
			if(point == M) {
				result = cnt[point];
				break;
			}

			for (int i : graph.get(point)) {
				//촌수를 확인한 경우 
				if(cnt[i] != -1) continue;
				cnt[i] = cnt[point] + 1; //다음 관계에 현재 촌수 + 1
				q.offer(i);
			}
		}
		return result;
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(br.readLine()); //전체 사람 수 

		graph = new ArrayList<ArrayList<Integer>>();
		cnt = new int[n + 1]; //촌수 

		//그래프 할당
		for (int i = 0; i < n + 1; i++) {
			graph.add(new ArrayList<Integer>());
		}
		//Arrays.fill(배열 변수, 배열 데이터) 값 초기화 
		Arrays.fill(cnt, -1);
		
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
		
		BFS(N);
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
}
