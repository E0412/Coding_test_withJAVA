package level_2;

import java.util.*;

//더 맵게
public class L2_37 {
	public int solution(int[] scoville, int K) {
		int answer = 0;

		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < scoville.length; i++) {
			list.add(scoville[i]);
		}
		Collections.sort(list);

		//수정 필요, long 자료형 고려하기 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1 로직 추가하기
		for (int i = 0; i < list.size(); i++) {
			if(list.get(0) < K) {
				list.remove(0);
				list.remove(1);
				list.add(list.get(0) + list.get(1) * list.get(1)); //새로운 음식
				answer++;
				Collections.sort(list);
			} else {
				break;
			}
		}
		return answer;
	}
}
