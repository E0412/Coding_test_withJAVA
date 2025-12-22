package level_0;

import java.util.*;

//진료 순서 정하기
public class L0_109 {
	public int[] solution(int[] emergency) {
		int[] tmp = emergency.clone();
		Arrays.sort(tmp);

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = 1; //우선순위
		for (int i = tmp.length-1; i >= 0; i--) {
			map.put(tmp[i], n++);
		}
		int answer[] = new int[emergency.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = map.get(emergency[i]);
		}
		return answer;
	}
}
