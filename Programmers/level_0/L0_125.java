package level_0;

//등수 매기기
public class L0_125 {
	public int[] solution(int[][] score) {
		int[] answer = new int[score.length];
		//등수를 비교하여 현재 값보다 큰 수가 있는경우 +1
		for(int i = 0; i < answer.length; i++) {
			int rank = 1;
			for(int j = 0; j < answer.length; j++) {
				//값 비교의 정확도를 위해 평균이 아닌 합을 비교
				if((score[i][0] + score[i][1]) < (score[j][0] + score[j][1])) {
					rank++;
				}
			}
			answer[i] = rank;
		}
		return answer;
	}
}
