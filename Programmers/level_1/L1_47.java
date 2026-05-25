package level_1;

import java.util.*;

//추억 점수
public class L1_47 {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo[0].length];

		Map<String, Integer> map = new TreeMap<String, Integer>();

		for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}

		//key값에 해당하는 value의 합을 저장하는 배열 생성
		
		return answer;
	}
}
