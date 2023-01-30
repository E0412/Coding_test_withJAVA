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

		for (int i = 1; i <= N; i++) 
			dq.add(i);

		int cnt = 0;
		int chcnt = 0; //방향을 바꾸면 1 추가 
		boolean change = true; //방향이 바뀔 때 

		while(!dq.isEmpty()) {
			int num;
			//방향을 바꾸는 경우
			if(change) {
				num = dq.pollFirst();
			} else {
				num = dq.pollLast();
			}
			cnt++;

			if(cnt == a) {
				cnt = 0;
				chcnt++;
				bw.write(num + "\n");
			} else {
				if(change) {
					dq.addLast(num);
				} else {
					dq.addFirst(num);
				}
			}

			if(chcnt == b) {
				chcnt = 0;
				change = false;
			}
		}
		bw.flush();
		bw.close();
	}
}
