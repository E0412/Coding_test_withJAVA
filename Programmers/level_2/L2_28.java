package level_2;

import java.util.*;

//프로세스
public class L2_28 {
	public int solution(int[] priorities, int location) {
		int answer = 0;

		Arrays.sort(priorities);
		Queue<int[]> q = new LinkedList<int[]>();

		for (int i = 0; i < priorities.length; i++) {
			q.offer(new int[] {priorities[i], i}); //현재 위치와 순서 저장
		}

		while(!q.isEmpty()) {
			//프로세스 위치에 따른 우선순위 구하기
		}

		return answer;
	}
}
