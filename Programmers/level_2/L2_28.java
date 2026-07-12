package level_2;

import java.util.*;

//프로세스
public class L2_28 {
	public int solution(int[] priorities, int location) {
		int answer = 0;

		Queue<int[]> q = new LinkedList<int[]>();

		for (int i = 0; i < priorities.length; i++) {
			q.offer(new int[] {i, priorities[i]}); //현재 위치와 순서 저장
		}

		//우선순위를 정렬한 배열 생성
		int[] arr = priorities.clone();
		Arrays.sort(arr);

		int idx = arr.length - 1;
		//프로세스 위치에 따른 우선순위 구하기
		while(!q.isEmpty()) {

			int[] current = q.poll(); //맨 앞을 꺼낸다 

			//현재 프로세스의 우선순위가 가장 높은지 확인
			if(current[1] == arr[idx]) {
				idx--; //역순으로 확인
				answer++;

				if(current[0] == location) {
					return answer;
				}
			} else {
				q.offer(current); //우선순위가 높은 프로세스가 있는 경우 뒤로 보낸다
			}
		}
		return answer;
	}
}
