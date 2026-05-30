package level_0;

import java.util.*;

//연속된 수의 합
public class L0_180 {
	public int[] solution(int num, int total) {
		List<Integer> list = new ArrayList<Integer>();

		int sum = num * (num - 1) / 2; //
		int m = total - sum; //total에서 sum 제거 
		int start = m / num; //시작값

		for (int i = 0; i < num; i++) {
			list.add(start + i);
		}

		return list.stream().mapToInt(i -> i).toArray();
	}
}
