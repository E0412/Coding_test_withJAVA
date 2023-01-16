package solution;

import java.io.*;
import java.util.Stack;

//괄호 끼워넣기(stack)
/*
 * 올바른 괄호열 = 괄호가 맞아떨어지는 것 ((()))
 * 올바른 괄호열으로 만들기 위해 앞과 뒤에 붙여야 할 괄호의 최소 개수를 출력
 */
public class B_11899 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String in = br.readLine();
		int cnt = 0;
		Stack<Character> s = new Stack<>();

		for (int i = 1; i <= 50; i++) {
			s.push(in.charAt(i));
			
			if(s.peek() == '(') {
				
			}
			
		}
		
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
