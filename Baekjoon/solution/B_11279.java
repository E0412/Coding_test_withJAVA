package solution;

import java.io.*;
import java.util.*;

//최대 힙
public class B_11279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i < N; i++) {
			int input = Integer.parseInt(br.readLine());

			if(input == 0) {
				if(!pq.isEmpty()) {
					bw.write(pq.poll() + "");
				} else {
					bw.write(0 + "");
				}
				bw.write("\n");
			} else {
				pq.add(input);
			}
		}

		bw.flush();
		bw.close();
	}
}
