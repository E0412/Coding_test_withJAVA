package solution;

import java.io.*;
import java.util.*;

//국회의원 선거(PriorityQueue)
/*  
 * 득표 수를 확인 후 매수해야 하는 사람의 최솟값을 출력
 */
public class B_1417 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine()); //후보의 수 
		int som = Integer.parseInt(br.readLine()); //다솜이의 득표수

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		//다른 후보의 득표수 
		for (int i = 0; i < N - 1; i++) 
			pq.add(Integer.parseInt(br.readLine()));

		int cnt = 0; //매수해야 하는 사람 
		//후보자가 1명인 경우 0 출력
		if(N == 1) {
			bw.write(0 + ""); bw.flush(); 
			return;
		}

		while(!pq.isEmpty() && pq.peek() >= som) {
			cnt++;
			som++;
			pq.add(pq.poll() - 1);
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
