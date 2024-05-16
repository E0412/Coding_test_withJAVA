package solution;

import java.io.*;
import java.util.StringTokenizer;

//컴백홈
public class B_1189 {

	static int R, C, K, cnt;
	static char[][] map;
	static int[][] visited;
	static int[] dx = {-1, 0, 0, 1};
	static int[] dy = {0, 1, -1, 0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer	st = new StringTokenizer(br.readLine());

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		map = new char[R][C];
		visited = new int[R][C];

		for (int i = 0; i < R; i++) {
			String s = br.readLine();
			for (int j = 0; j < C; j++) {
				map[i][j] = s.charAt(j); 
			}
		}

		//거리가 K인 가짓수를 출력

		bw.flush();
		bw.close();
	}
}
