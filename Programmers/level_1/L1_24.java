package level_1;

import java.util.*;

//제일 작은 수 제거하기
public class L1_24 {
	public int[] solution(int[] arr) {
		if(arr.length == 1) {
			return new int[]{-1};
		}
		//최소값 찾기
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != min) {
				list.add(arr[i]);
			}
		}    
		int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
		return answer;
	}
}
