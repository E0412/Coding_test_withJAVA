package level_0;

import java.util.*;

//문자열 잘라서 정렬하기
public class L0_69 {
	public String[] solution(String myString) {
		String[] arr = myString.split("x+"); //x를 기준으로 분리, 복수도 고려

		List<String> list = new ArrayList<String>();

		//빈 문자열을 제외하고 추가 
		for(String s : arr) {
			if(!s.isEmpty()) list.add(s);
		}
		Collections.sort(list); //정렬

		String[] answer = list.toArray(new String[0]);
		return answer;
	}
}
