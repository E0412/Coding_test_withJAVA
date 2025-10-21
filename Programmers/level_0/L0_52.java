package level_0;

import java.util.*;

//순서 바꾸기
public class L0_52 {
	public int[] solution(int[] num_list, int n) {
		List<Integer> list = new ArrayList<Integer>();

		//n번째 원소 이후의 원소
		for (int i = n; i < num_list.length; i++) {
			list.add(num_list[i]);
		}

		//n번째 까지의 원소
		for (int i = 0; i < n; i++) {
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
