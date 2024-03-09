package solution;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

//숫자판 점프 
public class B_2210 {

	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int[][] graph;
	static int[] arr;
	static ArrayList<String> list;

	static void DFS(int x, int y, int d) {
		if(d > 6) {
			String s = "";
			for (int i = 0; i < arr.length; i++) {
				s += Integer.valueOf(arr[i]);
			}
			//중복되지 않는 경우 리스트에 추가
			if(list.indexOf(s) < 0) list.add(s);
			return;
		}
		//깊이(d)가 6이 될 때까지 배열 할당
		arr[d - 1] = graph[x][y];

		//상하좌우 탐색
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if(nx >= 0 && nx <= 4 && ny >= 0 && ny <= 4)
				DFS(nx, ny, d + 1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		graph = new int[5][5];
		arr = new int[6];

		//할당
		for (int i = 0; i < 5; i++) {
			StringTokenizer st  = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}

		list = new ArrayList<String>();
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				DFS(i, j, 1);
			}
		}
		bw.write(list.size() + "");
		bw.flush();
		bw.close();
	}
}
