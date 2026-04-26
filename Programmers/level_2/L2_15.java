package level_2;

import java.util.*;

//귤 고르기
public class L2_15 {
	public int solution(int k, int[] tangerine) {
		int answer = 0;

		List<Integer> list = new ArrayList<Integer>();

		for(int i : tangerine) {
			list.add(i);
		}
		Collections.sort(list);
		//중복되는 수 분류 필요 
		for (int i = 1; i <= k; i++) {
			if(list.get(i-1) != list.get(i)) {
				answer++;
			}
		}
		return answer;
	}
}
