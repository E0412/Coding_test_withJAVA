package solution;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//스타트링크
public class B_5014 {

	static int F, S, G, U, D;
	static int visited[];
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	//S층에서 G층으로 가기 위해 눌러야 하는 버튼의 수의 최솟값을 출력
	static void BFS(int f, int s, int g, int u, int d) throws IOException {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(s);
		visited[s] = 1; //방문

		while(!q.isEmpty()) {
			int now = q.poll(); //현 위치

			if(now == g) {
				bw.write(visited[now] - 1 + "");
			}

			//U층 위로 가는 경우
			if(now + u <= f && visited[now + u] == 0) {
				visited[now + u] = visited[now] + 1;
				q.offer(now + u);
			}

			//D층 아래로 가는 경우 
			if(now - d > 0 && visited[now - d] == 0) {
				visited[now - d] = visited[now] + 1;
				q.offer(now - d);
			}
		}
		if(visited[g] == 0) bw.write("use the stairs");
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer	st = new StringTokenizer(br.readLine());

		F = Integer.parseInt(st.nextToken()); //가장 높은 층 
		S = Integer.parseInt(st.nextToken()); //현재 층수
		G = Integer.parseInt(st.nextToken()); //도달해야하는 층
		U = Integer.parseInt(st.nextToken()); //U층을 가는 버튼
		D = Integer.parseInt(st.nextToken()); //아래로 D층을 가는 버튼

		visited = new int[F + 1];

		BFS(F, S, G, U, D);

		bw.flush();
		bw.close();
	}
}
