package level_2;

//땅따먹기
public class L2_43 {
	int solution(int[][] land) {
		int answer = 0;
		int max = -1;
		
		for(int i = 0; i < land.length; i++) {
			int prev = 0; 
			for(int j = 0; j < land[0].length; j++) {
				////열 저장
				if(land[i][j] > max) {
					max = Math.max(max, land[i][j]);
					prev = j;
					answer += land[i][j];
				}
				//같은 열인지 확인
			}
		}
		return answer;
	}
}
