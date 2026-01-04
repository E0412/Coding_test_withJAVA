package level_2;

import java.util.*;

//의상
public class L2_03 {
	public int solution(String[][] clothes) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		//의상 종류를 저장, 같은경우 +1
		for (int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
		}
		int answer = 1;
		//각 경우의 수를 곱한다
		for(int num : map.values()) {
			answer *= (num + 1);
		}
		return answer-1;
	}
}
