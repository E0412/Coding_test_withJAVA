package level_0;

import java.util.*;

//n번째 원소부터
public class L0_50 {
	public int[] solution(int[] num_list, int n) {
		List<Integer> list = new ArrayList<Integer>();

		//n번째 원소 = num_list[i+1]
		for (int i = n-1; i < num_list.length; i++) {
			list.add(num_list[i]);
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
			System.out.println(answer[i]);
		}

		return answer;	
	}
}
