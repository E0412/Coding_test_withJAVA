package level_1;

import java.util.*;

//두 개 뽑아서 더하기
public class L1_17 {
	public int[] solution(int[] numbers) {
		//중복값이 포함되지 않게 set 활용
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		int answer[] = new int[set.size()];
		int n = 0;
		for(Object o : set) {
			answer[n] = (int) o;
			n++;
		}
		Arrays.sort(answer);
		return answer;
	}
}
