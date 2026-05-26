package level_1;

import java.util.*;

//추억 점수
public class L1_47 {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length]; //길이 오류 수정

		Map<String, Integer> map = new HashMap<String, Integer>(); //정렬 필요x -> hashmap 사용

		for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}

		//key값에 해당하는 value의 합을 저장하는 배열 생성
		for (int i = 0; i < photo.length; i++) {
			for (int j = 0; j < photo[i].length; j++) {
				answer[i] += map.getOrDefault(photo[i][j], 0); //찾는 값이 있으면 저장된 value를 더하고, 없으시 0을 더함 
			}
		}

		return answer;
	}
}
