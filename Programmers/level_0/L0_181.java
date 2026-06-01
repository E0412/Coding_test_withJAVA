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

		int max = 0; //최대 value값
		int cnt = 0; //최빈값 개수

		//entrySet() 활용
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {

			if(e.getValue() > max) {
				max = e.getValue();
				answer = e.getKey(); //최빈값
				cnt = 1;
			} else if(e.getValue() == max) {
				cnt++;
			}
		}

		return cnt > 1 ? -1 : answer;
	}
}
