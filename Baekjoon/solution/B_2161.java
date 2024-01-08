package solution;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

//카드1
public class B_2161 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<Integer>();

		for (int i = 1; i <= N; i++) {
			q.offer(i);
		}

		//버린 카드 출력
		while(q.size() != 1) {
			int card = q.poll(); //버리는 카드
			bw.write(card + " ");

			int last = q.poll(); //마지막에 남는 카드
			q.offer(last);
		}
		bw.write(q.poll() + "");
		bw.flush();
		bw.close();
	}
}
