package solution;

import java.io.*;
import java.util.*;

//쇠 막대기(stack)
/**
* 모든 '( )'는 반드시 레이저를 표현한다.
* 쇠막대기의 왼쪽 끝은 여는 괄호 '(' 로, 오른쪽 끝은 닫힌 괄호 ')' 로 표현된다. 
* 잘려진 쇠막대기 조각의 총 개수를 구하는 프로그램을 작성한다 
*/
public class B_10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		int cnt = 0; //조각의 개수 
		
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			//열린 괄호의 경우 스택에 추가
			if(ch == '(') {
				stack.push(ch);
			}
			//닫힌 괄호의 경우 스택에서 꺼낸다  
			if(ch == ')') {
				stack.pop();
				
				//이전 값이 열린 괄호인 경우(레이저) 조각의 개수 += 스택의 개수
				//ch - 1은 값이 정상적으로 출력되지 않는다 !
				if(input.charAt(i - 1) == '(') {
					cnt += stack.size();
				} 
				//이전 값이 닫힌 괄호인 경우(닫힌 문자열) 조각의 개수 + 1
				else {
					cnt++;
				}
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}
