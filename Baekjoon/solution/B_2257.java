package solution;

import java.io.*;
import java.util.Stack;

//화학식량
public class B_2257 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String in = br.readLine();
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < in.length(); i++) {
			char ch = in.charAt(i);
			//화학식량 계산 
			if(ch== ')') {
				int sum = 0;
				while(true) {
					if(stack.peek() == 0) {
						stack.pop(); //여는 괄호 삭제
						stack.push(sum); //총합 추가
						break;
					}
					sum += stack.pop();
				}
			}
			//화학식 추가
		}
		int total = 0; //화학식량 계산값
		
		bw.flush();
		bw.close();
	}
}
