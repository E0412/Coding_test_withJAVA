package solution;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

//부등호
public class B_2529 {

	static int K;
	static char[] arr;
	static boolean visited[] = new boolean[10];
	static ArrayList<String> ans = new ArrayList<String>();


	static void DFS(int p, int cnt, String num) {
		if(cnt == K) {
			ans.add(num);
			return;
		}

		//탐색
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		K = Integer.parseInt(br.readLine());
		arr = new char[K];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < K; i++) {
			arr[i] = st.nextToken().charAt(0);
		}

		for (int i = 0; i < 10; i++) {
			visited[i] = true;
			DFS(i, 0, i + ""); //i + "" -> 문자열로 변경
			visited[i] = false; 
		}

		
		bw.flush();
		bw.close();
	}	
}
