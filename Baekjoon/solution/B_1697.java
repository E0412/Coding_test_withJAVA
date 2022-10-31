package solution;

import java.io.*;
import java.util.*;


//숨바꼭질
/*
 * 수빈이의 위치가 X일 때 걷는다면 1초 후에 X-1 또는 X+1로 이동하게 된다
 * 순간이동을 하는 경우에는 1초 후에 2*X의 위치로 이동
 * 수빈이가 동생을 찾을 수 있는 가장 빠른 시간
 */
public class B_1697 {

	static int N, M; //수빈이와 동생의 위치
	static int visited[] = new int[100001]; //(0 ≤ N ≤ 100,000)

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static void BFS(int input) throws IOException {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(input);
		visited[input] = 1; //방문 처리

		while(!q.isEmpty()) {
			int x = q.poll();

			for (int i = 0; i < 3; i++) {
				int next;

				if(i == 0) {
					next = x + 1; //걷는 경우 1
				} else if(i == 1) {
					next = x - 1; //걷는경우 2
				} else {
					next = x * 2; //순간이동 하는 경우 
				}

				if(next == M) {
					bw.write(visited[x] + "");
					return; //return을 하지 않는 경우 ArrayIndexOutOfBoundsException 발생
				}

				//next가 범위 안에 있고 이전에 방문하지 않은 경우 
				if(next >= 0 && visited[next] == 0 && next < visited.length) {
					q.offer(next);
					visited[next] = visited[x] + 1;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		if(N == M) {
			bw.write(0 + ""); 
		} else {
			BFS(N);
		}

		bw.flush();
		bw.close();
	}
}
