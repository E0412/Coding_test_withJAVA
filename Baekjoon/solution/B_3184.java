package solution;

import java.io.*;
import java.util.StringTokenizer;

//양
/* 글자 '.' (점)은 빈 필드를 의미하며, 
 * 글자 '#'는 울타리를, 'o'는 양, 'v'는 늑대를 의미한다
 * 아침까지 살아있는 양과 늑대의 수를 의미하는 두 정수를 출력한다
 */
public class B_3184 {

	static int O, V, R, C;
	static int dx[] = {-1, 0, 1, 0};
	static int dy[] = {0, 1, 0, -1};

	static char[][] graph;
	static boolean[][] visited;

	static void DFS(int x, int y) {
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		R = Integer.parseInt(st.nextToken()); //행의 수
		C = Integer.parseInt(st.nextToken()); //열의 수

		graph = new char[R][C];
		visited = new boolean[R][C];

		for (int i = 0; i < R; i++) {
			String s = br.readLine();
			for (int j = 0; j < C; j++) {
				graph[i][j] = s.charAt(j); 
			}
		}

		int sheep = 0;
		int wolf = 0;

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if(graph[i][j]== '#') continue; //울타리인 경우
				//울타리가 아닌 경우
				O = V = 0; //O는 양, V는 늑대
				DFS(i, j);
				//양이 더 많은 경우
				if(O > V) sheep += O;
				//늑대가 더 많은 경우 
				else wolf += V;
			}
		}

		bw.flush();
		bw.close();
	}
}
