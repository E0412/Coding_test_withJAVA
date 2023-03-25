package solution;

import java.io.*;
import java.util.PriorityQueue;

//최대 힙
public class B_11279 {
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
