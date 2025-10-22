package level_0;

import java.util.*;

//왼쪽 오른쪽
public class L0_53 {
	public String[] solution(String[] str_list) {
		List<String> list = new ArrayList<>();

		for (int i = 0; i < str_list.length; i++) {
			//"l"인 경우 해당 인덱스 전까지 저장
			if(str_list[i].equals("l")) {
				for (int j = 0; j < i; j++) {
					list.add(str_list[j]);
				}
				break;
			} 
			//"r"인 경우 해당 인덱스 이후부터 저장
			else if(str_list[i].equals("r")) {
				for (int j = i + 1; j < str_list.length; j++) {
					list.add(str_list[j]);
				}
				break;
			} 
		}

		String[] answer = new String[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
