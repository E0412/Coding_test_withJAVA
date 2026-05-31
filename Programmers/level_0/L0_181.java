package level_0;

import java.util.*;

//최빈값 구하기
public class L0_181 {
	public int solution(int[] array) {
		int answer = 0;

		Map<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < array.length; i++) {
			map.put(array[i], map.getOrDefault(array[i], 0) + 1);
		}
		//수정필요 : 최빈값을 구해야하는데 횟수를 반환함
		for(int num : map.values()) {
			answer = Math.max(answer, num);
		}
		return answer;
	}
}
