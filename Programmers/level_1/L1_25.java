package level_1;

import java.util.*;

//나누어 떨어지는 숫자 배열
public class L1_25 {
	public int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {   
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		if(list.isEmpty()) {
			return new int[]{-1};
		}

		int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(answer);
		return answer;
	}
}
