package level_0;

import java.util.*;

//n번째 원소까지
public class L0_51 {
	public int[] solution(int[] num_list, int n) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= n - 1; i++) {
			list.add(num_list[i]);
		}

		int answer[] = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i); 
		}

		return answer;
	}
}
