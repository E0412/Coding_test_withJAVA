package level_0;

import java.util.*;

//배열 만들기 1
public class L0_41 {
	public int[] solution(int n, int k) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			if(i % k == 0) {
				list.add(i);
			}
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
