package level_0;

import java.util.*;

//배열 만들기 3
public class L0_47 {
	public int[] solution(int[] arr, int[][] intervals) {
		List<Integer> list = new ArrayList<>();

		for(int i = 0; i < intervals.length; i++) {
			int n = intervals[i][0];
			int m = intervals[i][1];

			for (int j = n; j <= m; j++) {
				list.add(arr[j]);
			}
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i); 
		}
		return answer;
	}
}
