package solution;

import java.io.*;
import java.util.*;

//요세푸스 문제
public class B_1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= N; i++) {
			q.offer(i);
		}

		StringBuilder sb = new StringBuilder();
		sb.append('<');

		//요세푸스 순열 구하기
		while(!q.isEmpty()) {
			for (int i = 1; i <= K; i++) {
				if(i == K) 
					if(q.size() == 1) {
						sb.append(q.poll());
					} else {
						sb.append(q.poll() + ", ");
					}
				else q.offer(q.poll());
			} 
		}
		sb.append('>');
		bw.write(sb.toString() + "\n");
		bw.flush();
		bw.close();
	}
}
