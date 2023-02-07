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

		//Collections.reverseOrder() > 숫자의 우선순위 변경 
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

		//다른 후보의 득표수 
		for (int i = 1; i < N; i++) 
			pq.add(Integer.parseInt(br.readLine()));

		int cnt = 0; //매수해야 하는 사람 

		//priority queue에 할당된 득표수가 다솜이의 득표수보다 많은경우
		while(!pq.isEmpty() && pq.peek() >= som) {
			cnt++; //매수해야하는 사람 증다
			som++; //다솜이의 득표수 증가
			pq.add(pq.poll() - 1);
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
