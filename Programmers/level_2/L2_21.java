package level_2;

import java.util.*;

//연속 부분 수열 합의 개수
public class L2_21 {
	public int solution(int[] elements) {
		Set<Integer> set = new HashSet<>();
		int[] arr = new int[elements.length * 2];

		for (int i = 0; i < elements.length; i++) {
			arr[i] = elements[i];
			arr[i + elements.length] = elements[i];
		}

		for(int i = 0; i < elements.length; i++) {
			int sum = 0;
			for(int len = 1; len <= elements.length; len++) { //길이
				sum += arr[i + len - 1]; //누적합
				set.add(sum);
			}
		}
		return set.size();
	}
}
