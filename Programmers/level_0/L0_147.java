package level_0;

import java.util.*;

//소인수분해
public class L0_147 {
	public int[] solution(int n) {
		List<Integer> list = new ArrayList<>();

		for(int i = 2; i * i <= n; i++) {
			if(n % i == 0) {
				list.add(i);
				while(n % i == 0) {
					n /= i;
				}
			}
		}
		if(n > 1) list.add(n);

		int answer[] = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i); 
		}

		return answer;
	}
}
