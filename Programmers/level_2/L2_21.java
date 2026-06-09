package level_2;

import java.util.*;

//연속 부분 수열 합의 개수
public class L2_21 {
	public int solution(int[] elements) {
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < elements.length; i++) {
			int sum = 0;
			set.add(elements[i]);
			for(int j = 1; j < elements.length; j++) {
				sum = elements[i] + elements[j];
				set.add(sum);
			}
		}
		int answer = set.size();
		return answer;
	}
}
