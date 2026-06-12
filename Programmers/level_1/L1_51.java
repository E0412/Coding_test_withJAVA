package level_1;

import java.util.*;

//모의고사
public class L1_51 {
	public int[] solution(int[] answers) {
		List<Integer> list = new ArrayList<>();
		int[] one = {1, 2, 3, 4, 5};
		int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

		for(int i = 0; i < answers.length; i++) {

		}

		return list.stream().mapToInt(i -> i).toArray();
	}
}
