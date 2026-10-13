package level_2;

import java.util.*;

//[1차] 캐시
public class L2_44 {
	public int solution(int cacheSize, String[] cities) {
		int answer = 0;
		Queue<String> q = new LinkedList<>();

		//LRU 알고리즘
		//수정 : cache hit일 때 queue가 새로 갱신 됨
		for(int i = 0; i < cities.length; i++) {
			//대소문자 구분을 하지 않음
			String s = cities[i].toLowerCase();

			//캐시 사이즈가 0인 경우 miss 
			if(cacheSize == 0) {
				answer += 5;
			}
			//q에 같은 인덱스가 있는 경우 갱신, hit
			else if(q.contains(s)) {
				q.remove(s);
				q.offer(s);
				answer++;
			}
			//큐가 꽉 찬 경우 miss
			else if(q.size() >= cacheSize) {
				q.poll();
				q.offer(s);
				answer += 5;
			}
			//꽉 차지 않은 경우 miss
			else {
				q.offer(s);
				answer += 5;
			}
		}
		return answer;
	}
}
