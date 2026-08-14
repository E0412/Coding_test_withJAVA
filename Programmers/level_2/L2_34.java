package level_2;

import java.util.*;

//튜플
public class L2_34 {
	public int[] solution(String s) {
		Set<String> set = new HashSet<>();

		for(char c : s.toCharArray()) {
			if(c == '{' || c == '}' || c == ',') {
				continue;
			} 
			set.add(String.valueOf(c));
		}

		int[] answer = new int[set.size()];

		return answer;
	}
}
