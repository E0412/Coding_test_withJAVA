package level_1;

import java.util.*;

//실패율, 블로그 풀이 참고함
public class L1_59 {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N + 1];

		double fail[] = new double[N + 1];

		//1번부터 N번 스테이지
		for (int i = 1; i <= N; i++) {
			int cnt = 0; //현재 스테이지에 도착한 사람 수 
			int not = 0; //현재 스테이지에서 못 깬 사람 수 

			for(int s : stages) {
				//유저가 s보다 높거나 같으면 도착
				if(s >= i) {
					cnt++;
				}
				//s와 동일하면 깨지 못한 것
				if(s == i) {
					not++;
				}
			}
			//현재 스테이지에 도착한 사람이 없는경우
			if(cnt == 0) {
				fail[i] = 0;
			} 
			//도달했으나 클리어하지 못한 플레이어 수 / 스테이지에 도달한 플레이어 수
			else {
				fail[i] = (double) not / cnt;
			}
		}

		//스테이지 번호를 list에 넣는다
		List<Integer> list = new ArrayList<Integer>();

		for(int i = 1; i <= N; i++) {
			list.add(i);
		}

		//실패율이 높은 순서로 정렬
		list.sort((a, b) -> {
			//실패율이 같으면 작은 번호부터 
			if(fail[a] == fail[b]) {
				return a - b;
			}
			return Double.compare(fail[b], fail[a]);
		});

		return list.stream().mapToInt(i -> i).toArray();
	}
}
