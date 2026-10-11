package level_2;

import java.util.*;

//[1차] 캐시
public class L2_44 {
	public int solution(int cacheSize, String[] cities) {
		int answer = 0;

		Queue<String> q = new LinkedList<>();

		for(String s : cities) {
			q.offer(s);
		}

		//LRU 알고리즘
		//list에 cacheSize 크기만 저장하고 계속 추가하는 방식 고려
		while(!q.isEmpty()) {
			if(q.size() <= cacheSize) {

			}


			break;
		}
		return answer;
	}
}
