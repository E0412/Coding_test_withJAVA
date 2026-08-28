package level_2;

import java.util.*;

//택배상자
public class L2_36 {
	public int solution(int[] order) {
		Stack<Integer> s = new Stack<>(); //보조 컨테이너

		int answer = 0;
		int idx = 0;

		for(int i = 1; i <= order.length; i++) {
			s.push(i);

			while (!s.isEmpty()
					&& idx < order.length
					&& s.peek() == order[idx]) {

				s.pop();
				answer++;
				idx++;
			}
		}
		return answer;
	}
}
