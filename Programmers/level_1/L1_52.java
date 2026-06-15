package level_1;

import java.util.Arrays;

//과일 장수
public class L1_52 {
	public int solution(int k, int m, int[] score) {
		int answer = 0;
		//내림차순 정렬
		Arrays.sort(score);

		int len = score.length;
		/*  m개씩 끊기
        	각 묶음의 마지막 원소(최저점수) 찾기
        	최저점수 x m
		 */
		for(int i = score.length % m; i < score.length; i += m) {
			answer += score[i] * m;
		}
		return answer;
	}
}
