package solution;

import java.io.*;
import java.util.*;

//큐(Queue 구현)
public class B_10845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while(N-- > 0) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			switch (st.nextToken()) {
			//push : 정수를 큐에 넣는 연산
			case "push":
				dq.offer(Integer.parseInt(st.nextToken()));
				break;
				
			//pop: 가장 앞에 있는 정수를 빼고, 그 수를 출력. 정수가 없는 경우 -1
			case "pop":
				Integer tmp = dq.poll(); //가장 앞에있는 정수
				if(tmp == null) {
					bw.write(-1 + "\n");
				} else {
					bw.write(tmp + "\n");
				}
				break;
				
			//size: 큐에 들어있는 정수의 개수를 출력
			case "size":
				bw.write(dq.size() + "\n");
				break;
				
			//empty: 큐가 비어있으면 1, 아니면 0을 출력	
			case "empty":
				if(dq.isEmpty()) {
					bw.write(1 + "\n");
				} else {
					bw.write(0 + "\n");
				}
				break;
				
			//front: 큐의 가장 앞에 있는 정수를 출력. 정수가 없는 경우 -1
			case "front":
				Integer tmp2 = dq.peek();
				if(tmp2 == null) {
					bw.write(-1 + "\n");
				} else {
					bw.write(tmp2 + "\n");
				}
				break;
				
			//back: 큐의 가장 뒤에 있는 정수를 출력. 정수가 없는 경우 -1	
			case "back":
				Integer tmp3 = dq.peekLast();
				if(tmp3 == null) {
					bw.write(-1 + "\n");
				} else {
					bw.write(tmp3 + "\n");
				}
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}
