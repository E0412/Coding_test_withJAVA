package level_2;

import java.util.*;

//n^2 배열 자르기
public class L2_24 {
	public int[] solution(int n, long left, long right) {
		int idx = (int) ((int) right - left) + 1;
		int[] answer = new int[idx];

		int[][] arr = new int[n][n];
		List<Integer> list = new ArrayList<>();

		//메모리 초과, 다른 방식 찾기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = Math.max(i, j) + 1; 
				list.add(arr[i][j]);
			}
		}

		int m = 0;
		for(long i = left; i <= right; i++) {
			answer[m++] = list.get((int)i);
		}
		return answer;
	}
}
