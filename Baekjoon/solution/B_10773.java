package solution;

import java.io.*;
import java.util.*;

//제로(stack)
public class B_10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i = 0; i < N; i++) {
			int num= Integer.parseInt(br.readLine());
			
			// 0이라면 스택에 저장된 top 원소를 지운다
			if(num == 0) {
				stack.pop();
			// 아닐경우는 스택에 원소 추가
			} else {
				stack.push(num);
			}
		}
		int sum = 0;
		for(int answer : stack) {
			sum += answer;
		}
		System.out.println(sum);
		
	}
}
