package level_0;

import java.util.*;

//배열 회전시키기
public class L0_112 {
	public int[] solution(int[] numbers, String direction) {
		List<Integer> list = new ArrayList<>();

		if(direction.equals("right")) {
			list.add(numbers[numbers.length-1]);
			for(int i = 0; i < numbers.length-1; i++) {
				list.add(numbers[i]);
			}
		} else if(direction.equals("left")) {
			for(int i = 1; i < numbers.length; i++) {
				list.add(numbers[i]);
			}
			list.add(numbers[0]); 
		}
		int answer[] = list.stream().mapToInt(Integer::intValue).toArray();

		return answer;
	}
}
