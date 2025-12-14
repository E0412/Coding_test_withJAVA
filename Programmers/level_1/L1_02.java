package level_1;

import java.util.Stack;

//같은 숫자는 싫어
public class L1_02 {
	public int[] solution(int []arr) {
		Stack<Integer> s = new Stack<>();

		for(int i = 0; i < arr.length; i++) {
			if(s.isEmpty()) {
				s.push(arr[i]);
			} 
			//현재 stack 값과 일치하지 않는 경우
			else if(s.peek() != arr[i]) {
				s.push(arr[i]);
			}
		}
		int[] answer = new int[s.size()];
		for(int i = answer.length-1; i >= 0; i--) {
			answer[i] = s.pop();
		}
		return answer;
	}
}
