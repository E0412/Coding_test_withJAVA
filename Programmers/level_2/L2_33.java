package level_2;

import java.util.Stack;

//괄호 회전하기
public class L2_33 {

	boolean chk(String s) {
		Stack<Character> st = new Stack<>();

		for(char c : s.toCharArray()) {
			if(st.isEmpty()) {
				return false;
			}
		}

		return false;
	}

	public int solution(String s) {
		int answer = 0;


		for(int i = 0; i < s.length(); i++) {
			//왼쪽으로 i칸 회전
			String r = s.substring(i)+ s.substring(0, i);



		}

		return answer;
	}
}
