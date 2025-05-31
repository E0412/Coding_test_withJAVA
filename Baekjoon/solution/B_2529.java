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
		//종료조건
		if(cnt == K) { //K개의 숫자를 전부 뽑은 경우 
			ans.add(num);
			return;
		}
		for (int i = 0; i < 10; i++) {
			if(!visited[i]) {
				//<인 경우 현재 순서 < 다음 순서, >인 경우 현재 > 다음
				if((arr[cnt] == '<' && p < i) || (arr[cnt] == '>' && p > i)) {
					visited[i] = true;
					DFS(i, cnt + 1, num + i);
					visited[i] = false;
				}
			}
		}
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
		bw.write(ans.get(ans.size() - 1) + "\n");
		bw.write(ans.get(0) + "\n");
		bw.flush();
		bw.close();
	}	
}
