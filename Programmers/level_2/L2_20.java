package level_2;

import java.util.Arrays;

//H-Index
public class L2_20 {
	public int solution(int[] citations) {
		int answer = 0;

		Arrays.sort(citations);

		//citations[i]번 이상 인용됐는지 확인, 횟수가 인용된 수와 동일한지 확인
		for(int i = 0; i < citations.length; i++) {
			//전체 논문 수 - i와 비교하여 해당하는 가장 작은 값 출력
			if(citations[i] >= citations.length - i) {
				answer = citations.length - i; //논문 수 저장
				break;
			}
		}
		return answer;
	}
}
