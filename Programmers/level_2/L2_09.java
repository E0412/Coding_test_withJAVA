package level_2;

import java.util.*;

//기능개발
public class L2_09 {
	public int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> q = new LinkedList<Integer>();
		List<Integer> list = new ArrayList<Integer>();

		//작업일수 저장
		for (int i = 0; i < speeds.length; i++) {
			int day = (100 - progresses[i] + speeds[i] - 1) / speeds[i]; //올림으로 저장
			q.offer(day);
		}

		while(!q.isEmpty()) {
			Integer current = q.poll();
			int cnt = 1;

			//현재값과 저장된 값을 비교하여 일수가 작으면 함께 배포 
			while(!q.isEmpty()) {
				if(q.peek() <= current) {
					cnt++;
					q.poll();
				} else {
					break;
				}
			}
			list.add(cnt);
		}

		return list.stream().mapToInt(i -> i).toArray();
	}
}
