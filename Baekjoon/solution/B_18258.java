package solution;

import java.io.*;
import java.util.*;

//큐 2(Queue, LinkedList)
//Queue로 구현하는 경우, 맨 뒤의 요소를 반환하는 메서드가 없기 때문에
//LinkedList 혹은 Deque을 사용한다 
public class B_18258 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Deque<Integer> q = new LinkedList<>();

		int N = Integer.parseInt(br.readLine());

		StringTokenizer command;

		while(N-- > 0) {
			command = new StringTokenizer(br.readLine(), " ");// 문자열 분리 

			switch(command.nextToken()) {	

			case "push":
				// offer는 큐의 맨 뒤에 요소를 추가한다.
				q.offer(Integer.parseInt(command.nextToken()));	
				break;

			case "pop" :
				/*
				 *  poll은 가장 앞에 있는 요소를 삭제하며
				 *  삭제할 원소가 없을 경우 예외를 던지는 것이 아닌 null을 반환한다.
				 */
				Integer tmp1 = q.poll();	
				if(tmp1 == null) {
					bw.write(-1 + "\n");
				}
				else {
					bw.write(tmp1 + "\n");
				}
				break;

			case "size":	
				bw.write(q.size() + "\n");
				break;

			case "empty":
				if(q.isEmpty()) {
					bw.write(1 + "\n");
				}
				else {
					bw.write(0 + "\n");
				}
				break;

			case "front":
				// peek()은 큐에 꺼낼 요소가 없을 경우 null을 반환한다.
				Integer tmp2 = q.peek();
				if(tmp2 == null) {
					bw.write(-1 + "\n");
				}
				else {
					bw.write(tmp2 + "\n");
				}
				break;

			case "back":
				// peekLast()은 큐에 꺼낼 요소가 없을 경우 null을 반환한다.
				Integer tmp3 = q.peekLast();	 
				if(tmp3 == null) {
					bw.write(-1 + "\n");
				}
				else {
					bw.write(tmp3 + "\n");
				}
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}

