package level_1;

import java.util.*;

//명예의 전당 (1)
public class L1_44 {
	public int[] solution(int k, int[] score) {
		List<Integer> list = new ArrayList<>();
		List<Integer> answer = new ArrayList<>();
		for(int i = 1; i < score.length; i++) {
			if(list.size() < 4) {
				list.add(score[i-1]);
			} else {
				list.add(Math.max(score[i-1], score[i]));
			}
			Collections.sort(list);
			if(list.size() > 3) {
				list.remove(0);
			}
			answer.add(list.get(0));      
		}

		return answer.stream().mapToInt(i -> i).toArray();
	}
}
