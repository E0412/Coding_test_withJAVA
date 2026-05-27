package level_2;

import java.util.Arrays;

//구명보트
public class L2_19 {
	public int solution(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);

		//앞 인덱스와 비교하게됨 -> 다른 방식 찾기
		int sum = 0;
		for(int i = 0; i < people.length; i++) {
			sum += people[i];
			if(sum > limit) {
				sum -= people[i-1];
				answer++;
			} else if(sum == limit) {
				answer++;
				sum -= limit;
			} 
		}
		return answer;
	}
}
