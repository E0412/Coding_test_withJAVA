package level_2;

import java.util.*;

//두 큐 합 같게 만들기
public class L2_40 {
	public int solution(int[] queue1, int[] queue2) {
		int answer = 0;

		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();

		long sum1 = 0;
		long sum2 = 0;
		//값 할당
		for(int i : queue1) {
			q1.add(i);
			sum1 += i;
		}
		for(int i : queue2) {
			q2.add(i);
			sum2 += i;
		}

		while(sum1 != sum2) { //같아질때까지 작업
			//총합의 합이 홀수이면 반환, 최대 반복횟수 지정
			if(sum1 + sum2 % 2 == 1 || q1.size() + q2.size() < answer) {
				return -1;
			}
			//큰 수의 큐에서 값을 빼서 더한다 
			if(sum1 > sum2) {
				int tmp = q1.poll();
				q2.add(tmp);

				sum1 -= tmp;
				sum2 += tmp;
				answer++;
			} 
			else if(sum1 < sum2) {
				int tmp = q2.poll();
				q1.add(tmp);

				sum2 -= tmp;
				sum1 += tmp;
				answer++;
			}
		}
		return answer;
	}
}
