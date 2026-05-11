package level_0;

import java.util.*;

//약수 구하기
public class L0_172 {
	public int[] solution(int n) {
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				list.add(i);
			}
		}
		return list.stream().mapToInt(i -> i).toArray();
	}
}
