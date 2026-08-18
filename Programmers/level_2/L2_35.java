package level_2;

import java.util.*;

//숫자 변환하기
public class L2_35 {
	public int solution(int x, int y, int n) {
		int answer = 0;

		Queue<Integer> q = new LinkedList<Integer>();
		boolean chk[] = new boolean[y + 1]; 

		q.add(x);
		chk[x] = true;

		while(!q.isEmpty()) {
			int size = q.size();

			for (int i = 0; i < size; i++) {
				int cur = q.poll(); //현재 저장된 수

				if(cur == y) { //값이 같으면 반환
					return answer;
				}

				//연산 경우의 수 -> 현재 값으로 갱신
				int[] add = {cur + n, cur * 2, cur * 3}; 

				for(int m : add) { //경우의 수 탐색
					//y보다 작은경우 추가
					if(m <= y && !chk[m]) {
						chk[m] = true; //중복 방지
						q.add(m);
					}
				}
			}
			answer++;
		}
		return -1; 
	}
}
