package level_0;

import java.util.*;

//세 개의 구분자
public class L0_72 {
	public String[] solution(String myStr) {
		myStr = myStr.replace("a", "c").replace("b", "c");
		String[] answer = myStr.split("c+");

		List<String> list = new ArrayList<String>();
		for(String s : answer) {
			if(!s.isEmpty()) list.add(s);
		}
		if(list.isEmpty()) list.add("EMPTY");

		answer = list.toArray(new String[0]);
		return answer;
	}
}
