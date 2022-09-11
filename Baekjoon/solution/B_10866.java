package solution;

import java.io.*;
import java.util.*;

//덱(Deque)
//덱 - Double-ended Queue
public class B_10866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] s = br.readLine().split(" ");

			// 첫 번째 단어에 대한 switch문 
			switch (s[0]) {
			//정수 X를 덱의 앞에 넣는다
			case "push_front": {
				deque.addFirst(Integer.parseInt(s[1]));
				break;
			}
			//정수 X를 덱의 뒤에 넣는다
			case "push_back": {
				deque.addLast(Integer.parseInt(s[1]));
				break;
			}
			//덱의 가장 뒤에 앞에 있는 수를 빼고, 그 수를 출력. 정수가 없는 경우 -1
			case "pop_front": {
				if (deque.isEmpty()) {
					bw.write(-1 + "\n");
				} 
				else {
					bw.write(deque.pollFirst() + "\n");
				}
				break;
			}
			//덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력. 정수가 없는 경우 -1
			case "pop_back": {
				if (deque.isEmpty()) {
					bw.write(-1 + "\n");
				} 
				else {
					bw.write(deque.pollLast() + "\n");
				}
				break;
			}
			//덱에 들어있는 정수의 개수를 출력
			case "size": {
				bw.write(deque.size() + "\n");
				break;
			}
			//덱이 비어있으면 1을, 아니면 0을 출력
			case "empty": {
				if (deque.isEmpty()) {
					bw.write(1 + "\n");
				} 
				else {
					bw.write(0 + "\n");
				}
				break;
			}
			//덱의 가장 앞에 있는 정수를 출력, 정수가 없는 경우 -1
			case "front": {
				if (deque.isEmpty()) {
					bw.write(-1 + "\n");
				} 
				else {
					bw.write(deque.peekFirst() + "\n");
				}
				break;
			}
			//덱의 가장 뒤에 있는 정수를 출력, 정수가 없는 경우 -1
			case "back": {
				if (deque.isEmpty()) {
					bw.write(-1 + "\n");
				} 
				else {
					bw.write(deque.peekLast() + "\n");
				}
				break;
			}
			}
		}
		bw.flush();
		bw.close();
	}
}
