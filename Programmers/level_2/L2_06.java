package level_2;

import java.util.Stack;

//짝지어 제거하기
public class L2_06 {
	public int solution(String s) {
		Stack<Character> st = new Stack<>();
		for(char ch : s.toCharArray()) {
			if(!st.isEmpty() && st.peek() == ch) {
				st.pop();
			} else {
				st.push(ch);
			}
		}
		return st.isEmpty() ? 1 : 0;
	}
}
