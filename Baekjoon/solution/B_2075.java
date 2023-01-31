package solution;

import java.io.*;
import java.util.*;

//N번째 큰 수 
/*
 * N번째 큰 수를 찾는 프로그램을 작성한다
 */
public class B_2075 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		//Queue의 구조를 가지며, 들어온 순서가 아닌 우선순위를 먼저 결정하고 내보낸다
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int m = Integer.parseInt(st.nextToken());
			pq.offer(m);
		}
		
		bw.flush();
		bw.close();
	}
}
