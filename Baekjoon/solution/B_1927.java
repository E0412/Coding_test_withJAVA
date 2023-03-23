package solution;

import java.io.*;
import java.util.PriorityQueue;

//최소 힙
/*
 * 배열에 자연수 x를 넣는다.
 * 배열에서 가장 작은 값을 출력하고, 그 값을 배열에서 제거한다.
 */
public class B_1927 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for (int i = 0; i < N; i++) {
			int input = Integer.parseInt(br.readLine());
		}

		bw.flush();
		bw.close();
	}
}
