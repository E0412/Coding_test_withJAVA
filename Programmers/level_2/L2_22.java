package level_2;

import java.util.*;

//할인 행사
public class L2_22 {
	public int solution(String[] want, int[] number, String[] discount) {
		int answer = 0;

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < want.length; i++) {
			map.put(want[i], number[i]);
		}

		//가능한 시작점 범위 : 10
		for (int i = 0; i <= discount.length - 10; i++) {
			Map<String, Integer> days = new HashMap<String, Integer>();
			for (int j = i; j < i + 10; j++) {
				days.put(discount[j], days.getOrDefault(discount[j], 0) + 1);
			}
			if(map.equals(days)) {
				answer++;
			}
		}
		return answer;
	}
}
