package level_2;

import java.util.Arrays;

//H-Index
public class L2_20 {
	public int solution(int[] citations) {
		int answer = 0;

		Arrays.sort(citations);

		//citations[i]번 이상 인용됐는지 확인, 횟수가 인용된 수와 동일한지 확인
		for(int i = 0; i < citations.length; i++) {
			answer = 0;
			for(int j = i; j < citations.length; j++) {
				if(citations[i] <= citations[j]) {
					answer++;
				}
			}
			if(answer == citations[i]) break;
		}
		return answer;
	}
}
