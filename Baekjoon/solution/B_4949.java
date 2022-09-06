package solution;

import java.io.*;
import java.util.*;

//균형잡힌 세상(stack)
/**
 * 각 줄마다 해당 문자열이 균형을 이루고 있으면 "yes"를, 아니면 "no"를 출력한다 
 * 고려할 사항 : 종료(해당사항이 없는경우), 소괄호와 대괄호의 균형 
 */
public class B_4949 {
	//스택의 메서드 
	public static String answer(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			//여는 괄호의 경우 push
			if(c == '(' || c == '[') {
				stack.push(c);
			}
			
			//닫는 소괄호
			else if(c == ')') {
				//스택이 비어있거나 || 꺼낼 원소가 소괄호와 매칭이 안될 때
				if(stack.isEmpty() || stack.peek() != '(') {
					return "no";
				} else { //그 외의 경우 pop
					stack.pop();
				}
			}
			//닫는 대괄호
			else if(c == ']') {
				//스택이 비어있거나 || 꺼낼 원소가 대괄호와 매칭이 안될 때
				if(stack.isEmpty() || stack.peek() != '[') {
					return "no";
				} else { //그 외의 경우 pop
					stack.pop();
				}
			}
		}
		if(stack.isEmpty()) {
			return "yes";
		} else {
			return "no";
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input;
		
		while(true) {
			input = br.readLine();
			
			//종료 조건문
			if(input.equals(".")) {
				break;
			}
			sb.append(answer(input)).append('\n');
		}
		System.out.println(sb);
	}
}
