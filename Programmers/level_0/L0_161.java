package level_0;

import java.util.*;

//특이한 정렬
public class L0_161 {
	public int[] solution(int[] numlist, int n) {
		Integer[] answer = new Integer[numlist.length];

		for(int i = 0; i < numlist.length; i++) {
			answer[i] = numlist[i];
		}

		Arrays.sort(answer, (a, b) -> {
			int i = Math.abs(a - n);
			int j = Math.abs(b - n);

			if(i == j) {
				return Integer.compare(b, a); //값 비교
			}
			return Integer.compare(i, j);
		});
		return Arrays.stream(answer).mapToInt(i -> i).toArray();
	}
}
