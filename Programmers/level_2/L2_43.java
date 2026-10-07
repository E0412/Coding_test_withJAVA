package level_2;

//땅따먹기
public class L2_43 {
	int solution(int[][] land) {
		int answer = 0;

		int[] dp = land[0].clone(); //현재까지 누적 합
		int[] next = new int[land[0].length]; //다음행까지 누적 합

		//누적 합을 반환
		for (int i = 1; i < land.length; i++) {
			for (int j = 0; j < land[0].length; j++) {
				int max = -1;

				for (int k = 0; k < land[0].length; k++) {
					//같은 열이면 패스
					if(j == k) continue;
					//제일 큰 수 저장
					else {
						max = Math.max(max, dp[k]);
					}
				}
				//최대 점수 합을 저장
				next[j] = land[i][j] + max;  
			}
			//dp에 최종 정보를 담음
			int[] tmp = dp;
			dp = next;
			next = tmp;
		}

		//가장 큰 수 출력
		for(int i : dp) {
			answer = Math.max(answer, i);
		}

		return answer;
	}
}
