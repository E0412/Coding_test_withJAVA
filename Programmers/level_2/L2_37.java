package level_2;

import java.util.*;

//더 맵게
public class L2_37 {
	public int solution(int[] scoville, int K) {
		int answer = 0;

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for(int n : scoville) {
			pq.add(n);
		}

		//가장 작은 음식이 K 이상이면 종료 
		while(pq.peek() < K) {
			//음식이 2개 미만인 경우 -1 반환
			if(pq.size() < 2) {
				return -1;
			}
			//가장 작은 음식
			int first = pq.poll();

			//두번째로 작은 음식
			int second = pq.poll();

			int food = first + (second * 2);
			pq.add(food);

			answer++; //횟수 증가 
		}
		return answer;
	}
}
