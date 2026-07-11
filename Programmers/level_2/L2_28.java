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

		//정렬된 배열 생성
		Arrays.sort(priorities);
		int[] arr = priorities.clone();
		int m = 0;
		for(int i = priorities.length - 1; i > 0; i--) {
			arr[m++] = priorities[i];
		} 

		int idx = 0;
		while(!q.isEmpty()) {
			//프로세스 위치에 따른 우선순위 구하기

			int[] current = q.poll(); //맨 앞을 꺼낸다 
			
			//뒤에 나보다 우선순위가 높은 프로세스가 있는지 확인
			if(current[1] == arr[idx]) {


			}
		}
		return answer;
	}
}
