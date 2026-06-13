package level_1;

import java.util.*;

//모의고사
public class L1_51 {
	public int[] solution(int[] answers) {
		List<Integer> list = new ArrayList<>();
		int[] one = {1, 2, 3, 4, 5};
		int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

		int score1 = 0;
		int score2 = 0;
		int score3 = 0;

		for(int i = 0; i < answers.length; i++) {
			//숫자가 같으면 score++
			if(answers[i] == one[i % one.length]) {
				score1++;
			}
			if(answers[i] == two[i % two.length]) {
				score2++;
			}
			if(answers[i] == three[i % three.length]) {
				score3++;
			}
		}
		int max = Math.max(score1, Math.max(score2, score3));

		if(score1 == max) list.add(1);
		if(score2 == max) list.add(2);
		if(score3 == max) list.add(3);

		return list.stream().mapToInt(i -> i).toArray();
	}
}
