package level_2;

import java.util.Stack;

//괄호 회전하기
public class L2_33 {

	boolean chk(String s) {
		Stack<Character> st = new Stack<>();

		for(char c : s.toCharArray()) {
			//여는 괄호면 push
			if(c == '(' || c == '[' || c == '{') {
				st.push(c);
			} 
			//닫는 괄호인 경우
			else {
				//stack이 비어있는 경우 false
				if(st.isEmpty()) {
					return false;
				}
				char top = st.peek(); //현재 스택

				//짝이 맞으면 내보낸다
				if(c == ')' && top == '(' || c == ']' && top == '[' || c == '}' && top == '{') {
					st.pop();
				}
				//짝이 맞지 않으면 false
				else {
					return false;
				}
			}
		}
		return st.isEmpty(); //괄호 처리 후 스택이 비어있어야 성공
	}

	public int solution(String s) {
		int answer = 0;

		for(int i = 0; i < s.length(); i++) {
			//왼쪽으로 i칸 회전
			String r = s.substring(i)+ s.substring(0, i);

			if(chk(r)) {
				answer++;
			}
		}
		return answer;
	}
}
