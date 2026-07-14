package level_2;

import java.util.Stack;

//뒤에 있는 큰 수 찾기
public class L2_29 {
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];

		Stack<Integer> s = new Stack<Integer>();

		for(int i = numbers.length - 1; i >= 0; i--) {
			//현재 숫자보다 작거나 같으면 뒷 큰 수가 될 수 없어 제거
			while(!s.isEmpty() && s.peek() <= numbers[i]) {
				s.pop();
			}

			if (s.isEmpty()) { //자신보다 큰 수가 없는 경우
				answer[i] = -1;
			} else {
				answer[i] = s.peek();
			}
			//현재 수를 큰 수 후보로 저장
			s.push(numbers[i]);
		}
		return answer;
	}
}
