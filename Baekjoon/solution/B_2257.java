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
						stack.add(sum); //총합 추가
						break;
					}
					sum += stack.pop();
				}
			}
			//화학식 추가 수소, 탄소, 산소
			else if(ch == 'H') stack.add(1);
			else if(ch == 'C') stack.add(12);
			else if(ch == 'O') stack.add(16);
			//숫자
			else if(ch >= '0' && ch <= '9') 
				stack.add(stack.pop() * (ch - '0')); //최근값 * 현재 숫자
			else stack.add(0);
		}

		int total = 0; //화학식량 계산값

		while(!stack.isEmpty()) {
			total += stack.pop();
		}
		bw.write(total + "");
		bw.flush();
		bw.close();
	}
}
