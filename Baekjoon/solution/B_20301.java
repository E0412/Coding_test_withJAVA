package solution;

import java.io.*;
import java.util.*;

//반전 요세푸스(Deque)
public class B_20301 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		Deque<Integer> dq = new ArrayDeque<Integer>();

		for (int i = 0; i < N; i++) {
			dq.add(i);

			int cnt = 0;
			int ch = 0; //방향을 바꾸면 1 추가 
			boolean change = true; //방향이 바뀔 때 

			while(!dq.isEmpty()) {

			}
		}

		bw.flush();
		bw.close();
	}
}
