package level_1;

import java.util.Arrays;

//예산
public class L1_35 {
	public int solution(int[] d, int budget) {
		int answer = 0;
		int idx = 0;
		Arrays.sort(d); 
		//인덱스 범위 지정안하면 예외 발생함
		while(idx < d.length && budget >= d[idx]) {
			budget -= d[idx];
			idx++;
			answer++;
		}
		return answer;
	}
}
