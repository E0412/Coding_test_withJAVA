package solution;

import java.io.*;
import java.util.*;

//카드 놓기(Deque)
/* 
 * 기술 사용 전 카드의 상태를 출력 
 */
public class B_18115 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			Deque<Integer> dq = new LinkedList<>();
			dq.add(i);
		}

		bw.flush();
		bw.close();
	}
}
