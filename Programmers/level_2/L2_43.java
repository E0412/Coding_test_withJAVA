package level_2;

//땅따먹기
public class L2_43 {
	int solution(int[][] land) {
		int answer = 0;

		//dp
		int[] prev = new int[land[0].length]; //이전 값
		int[] dp = new int[land[0].length]; //현재 값 저장

		//첫번째 행 저장
		for(int i = 0; i < land[0].length; i++) {
			prev[i] = land[0][i];
		}

		//두번째 행부터 최대값 저장
		for(int i = 1; i < land.length; i++) {
			for(int j = 0; j < land[0].length; j++) {
				int max = -1;
				for(int k = 0; k < land[0].length; k++) {
					if(j == k) {
						continue;
					}
					max = Math.max(max, prev[k]); //최댓값 저장
				}
			}
		}

		return answer;
	}
}
