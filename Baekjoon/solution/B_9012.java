package solution;

import java.io.*;
import java.util.*;

//괄호(stack)
public class B_9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			bw.write(answer(br.readLine())+ "\n");
		}
		bw.flush();
		bw.close();
		
	}
	public static String answer(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			//여는 괄호인 경우 스택에 넣는다 
			if(ch == '(') {
				stack.push(ch);
			}
			
			//닫는 괄호의 경우 
			//스택이 비어있을 때
			else if(stack.empty()) {
				return "NO";
			}
			//그 외의 경우에는 pop
			else {
				stack.pop();
			}
		}
		//검사를 마치고 스택에 잔여 요소가 있을 때
		//스택이 비어있으면 YES
		if(stack.empty()) {
			return "YES";
		} else { //여는 괄호가 많은 경우 NO
			return "NO";
		}
}
}
