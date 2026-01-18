package level_0;

import java.util.*;

//중복된 문자 제거
public class L0_132 {
	public String solution(String my_string) {
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i = 0; i < my_string.length(); i++) {
			set.add(my_string.charAt(i));
		}
		for(char c : set) {
			//String answer 변수를 만들어 answer += c;로 풀이 후 성능을 보고 StringBuilder를 사용한 방식으로 변경
			sb.append(c); 
		}
		return sb.toString();
	}
}
