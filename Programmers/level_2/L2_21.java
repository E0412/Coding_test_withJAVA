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

		for(int i = 1; i <= elements.length; i++) { //길이
			int sum = 0;
			for(int j = 0; j < arr.length; j++) {
				sum += arr[i + j];
				set.add(sum);
			}
		}
		int answer = set.size();
		return answer;
	}
}
