package solution;

import java.io.*;
import java.util.*;

//스택
public class B_10828 {

	public static int[] stack;
	public static int size = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		stack = new int[N];

		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");

			switch (st.nextToken()) {

			case "push" :
				push(Integer.parseInt(st.nextToken()));
				break;

			case "pop":
				bw.write(pop() + "\n");
				break;

			case "size":
				bw.write(size() + "\n");
				break;

			case "empty":
				bw.write(empty() + "\n");
				break;

			case "top":
				bw.write(top() + "\n");
				break;

			}
		}
		bw.flush();
		bw.close();
	}

	//정수를 스택에 넣는 연산
	public static void push(int item) {
		stack[size] = item;
		size++;
	}

	//스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력
	//정수가 없는 경우에는 -1을 출력
	public static int pop() {
		if(size == 0) {
			return -1;
		} else {
			int p = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return p;
		}
	}

	//스택에 들어있는 정수의 개수를 출력
	public static int size() {
		return size;
	}

	//스택이 비어있으면 1, 아니면 0을 출력
	public static int empty() {
		if(size == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	//스택의 가장 위에 있는 정수를 출력
	//들어있는 정수가 없는 경우에는 -1을 출력
	public static int top() {
		if(size == 0) {
			return -1;
		} else {
			return stack[size - 1];
		}
	}
}

