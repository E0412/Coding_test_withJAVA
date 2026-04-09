package level_0;

import java.util.*;

//문자열 정렬하기 (1)
public class L0_158 {
	public int[] solution(String my_string) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < my_string.length(); i++) {
			if(my_string.charAt(i) < 'a') {
				list.add(my_string.charAt(i) - '0');
			}
		}
		Collections.sort(list);
		return list.stream().mapToInt(i -> i).toArray();
	}
}
