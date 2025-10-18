package level_0;

import java.util.Arrays;

//2의 영역, 풀이를 참고한 문제
public class L0_48 {
	public int[] solution(int[] arr) {

		int start = 100000; //2 시작 인덱스
		int end = 1; //2 마지막 인덱스

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 2) {
				start = Math.min(start, i); //가장 작은 인덱스
				end = Math.max(end, i); //가장 큰 인덱스 
			}
		}

		if(start <= end) {
			return Arrays.copyOfRange(arr, start, end + 1);
		} else {
			return new int[]{-1};
		}
	}
}
