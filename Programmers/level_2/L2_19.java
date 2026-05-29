package level_2;

import java.util.Arrays;

//구명보트
public class L2_19 {
	public int solution(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);

		//투포인터 방식 사용
		int l = 0;
		int r = people.length - 1;

		while(l <= r) {
			//같이 타는 경우, 작은 수끼리 더하면 무거운 사람이 혼자 남아 최소가 안됨
			if(people[l] + people[r] <= limit) {
				l++;
			}
			r--; //가장 큰 수 삭제
			answer++; //보트 사용
		}

		return answer;
	}
}
