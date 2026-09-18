package level_2;

import java.util.*;

//두 큐 합 같게 만들기
public class L2_40 {
	public int solution(int[] queue1, int[] queue2) {
		//두 큐의 sum을 구하고 -q1 + q1 / -q2, +q2 (한 사이클), 답은 연산의 횟수를 구해야함 
		int answer = 0;

		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		int sum1 = 0;
		int sum2 = 0;
		for(int i : queue1) {
			q1.add(i);
			sum1 += i;
		}
		for(int i : queue1) {
			q2.add(i);
			sum2 += i;
		}

		while(sum1 == sum2) {
			//q1.poll을 q2에 추가, 합 구하기



			break;
		}


		return answer;
	}
}
