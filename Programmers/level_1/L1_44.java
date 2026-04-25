package level_1;

import java.util.*;

//명예의 전당 (1)
public class L1_44 {
	public int[] solution(int k, int[] score) {
		List<Integer> list = new ArrayList<>();
		List<Integer> answer = new ArrayList<>();
		for(int i = 1; i < score.length; i++) {
			list.add(score[i]);
			Collections.sort(list);

			if(list.size() > k) {
				list.remove(0);
			}
			answer.add(list.get(0));      
		}

		return answer.stream().mapToInt(i -> i).toArray();
	}
}
