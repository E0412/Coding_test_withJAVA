package solution;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
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
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		graph = new int[5][5];
		arr = new int[6];

		//할당
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}

		bw.flush();
		bw.close();
	}
}
