package level_2;

import java.util.*;

//[1차] 캐시
public class L2_44 {
	public int solution(int cacheSize, String[] cities) {
		int answer = 0;
		Queue<String> q = new LinkedList<>();

		//LRU 알고리즘
		//수정필요 : cache hit일 때 queue가 새로 갱신 되어야함
		for(int i = 0; i < cities.length; i++) {
			//캐시가 전부 채워진 경우
			if(q.size() >= cacheSize) {
				if(q.contains(cities[i])) {
					//cache hit
					answer++;
				} else {
					q.poll();
					q.offer(cities[i]);
					//cache miss
					answer += 5;
				}
			} else {
				q.offer(cities[i]);
				answer++;
			}
		}
		return answer;
	}
}
