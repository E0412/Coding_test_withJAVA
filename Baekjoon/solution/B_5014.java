package solution;

import java.io.*;
import java.util.StringTokenizer;

//스타트링크
public class B_5014 {

	static int F, S, G, U, D;
	static int visited[];

	//S층에서 G층으로 가기 위해 눌러야 하는 버튼의 수의 최솟값을 출력
	static void BFS(int f, int s, int g, int u, int d) {

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st = new StringTokenizer(br.readLine());

		F = Integer.parseInt(st.nextToken()); //가장 높은 층 
		S = Integer.parseInt(st.nextToken()); //현재 층수
		G = Integer.parseInt(st.nextToken()); //도달해야하는 층
		U = Integer.parseInt(st.nextToken()); //U층을 가는 버튼
		D = Integer.parseInt(st.nextToken()); //아래로 D층을 가는 버튼

		visited = new int[F + 1];

		bw.flush();
		bw.close();
	}
}
