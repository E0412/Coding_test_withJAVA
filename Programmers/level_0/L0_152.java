package level_0;

import java.util.ArrayList;
import java.util.List;

//배열 자르기
public class L0_152 {
	public int[] solution(int[] numbers, int num1, int num2) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = num1; i <= num2; i++) {
			list.add(numbers[i]);
		}
		int answer[] = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
