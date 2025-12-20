package level_1;

import java.util.*;

//완주하지 못한 선수
public class L1_04 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";

		Map<String, Integer> m = new HashMap<String, Integer>();

		//map에 이름과 이름의 수 추가
		for(String p : participant) {
			m.put(p, m.getOrDefault(p, 0)+1);
		}
		//같은 경우 value 값을 뺀다
		for(String c : completion) {
			m.put(c, m.get(c)-1);
		}

		for(String s : m.keySet()) {
			//value 값이 0이 아닌경우 해당 이름 출력
			if(m.get(s) != 0) {
				answer = s;
			}
		}
		return answer;
	}
}
