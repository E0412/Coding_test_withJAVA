package level_0;

import java.util.*;

//배열 조각하기
public class L0_49 {
	public int[] solution(int[] arr, int[] query) {
		List<Integer> list = new ArrayList<Integer>();

		for(int x : arr) {
			list.add(x);
		}

		for (int i = 0; i < query.length; i++) {
			//query[i]의 값이 아닌 인덱스 i가 짝수인 경우
			if(i % 2 == 0) {
				//query[i]번 인덱스를 제외하고 뒷부분을 자른다
				list = list.subList(0, query[i] + 1);
			}
			//인덱스 i가 홀수인 경우
			else {
				//query[i]번 인덱스를 제외하고 앞부분을 자른다
				list = list.subList(query[i], list.size());
			}
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
