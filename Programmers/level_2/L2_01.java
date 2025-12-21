package level_2;

import java.util.*;

//전화번호 목록
public class L2_01 {
	public boolean solution(String[] phone_book) {
		boolean answer = true;

		Set<String> set = new HashSet<String>();
		for(String s : phone_book) {
			set.add(s);
		}

		for(String str : phone_book) {
			//번호를 하나씩 늘려가며 비교
			for (int i = 1; i < str.length(); i++) {
				String pn = str.substring(0, i);
				//같은 번호가 있는경우 false로 변경
				if(set.contains(pn)) {
					answer = false;
				}
			}
		}
		return answer;
	}
}
