package solution;

import java.io.*;
import java.util.*;

//숨바꼭질(BFS)
/*
* 수빈이의 위치가 X일 때 걷는다면 1초 후에 X-1 또는 X+1로 이동하게 된다
* 순간이동을 하는 경우에는 1초 후에 2*X의 위치로 이동
* 수빈이가 동생을 찾을 수 있는 가장 빠른 시간
*/
public class B1697 {

	static int N, M; //수빈이와 동생의 위치
	static int visited[] = new int[100001]; //(0 ≤ N ≤ 100,000)


	static int BFS(int in) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(in);
		visited[in] = 1; //방문 처리 
		
		while(!q.isEmpty()) {
			int x = q.poll();
			
			if(x == M) {
				return visited[x] - 1;
			}
			
			//-1칸으로 이동, 방문하지 않은 경우 
			if(x - 1 >= 0 && visited[x - 1] == 0) {
				visited[x - 1] = visited[x] + 1;
				q.offer(x - 1);
			}
			
			//+1칸으로 이동, 방문하지 않은 경우
			if(x + 1 <= 100000 && visited[x + 1] == 0) {
				visited[x + 1] = visited[x] + 1;
				q.offer(x + 1);
			}
			
			//*2칸으로 이동, 방문하지 않은 경우
			if(x * 2 <= 100000 && visited[x * 2] == 0) {
				visited[x * 2] = visited[x] + 1;
				q.offer(x * 2);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		bw.write(BFS(N) + "");
		bw.flush();
		bw.close();
	}
}
