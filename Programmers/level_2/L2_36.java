package level_2;

import java.util.*;

//택배상자
public class L2_36 {
	public int solution(int[] order) {
		List<Integer> truck = new ArrayList<>(); //트럭
		Stack<Integer> s = new Stack<>(); //보조 컨테이너

		for(int i = 1; i <= order.length; i++) {
			if(order[i-1] == i) {
				truck.add(i);
			} 
			else if(!s.isEmpty() && s.peek() == order[i-1]) {
				truck.add(s.pop());
			}
			else {
				s.add(i);
			}
		}
		return truck.size();
	}
}
