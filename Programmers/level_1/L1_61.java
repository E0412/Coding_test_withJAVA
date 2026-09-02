package level_1;

//로또의 최고 순위와 최저 순위 
public class L1_61 {
	public int[] solution(int[] lottos, int[] win_nums) {
		int max = 0;
		int cnt = 0;

		for (int i = 0; i < lottos.length; i++) {
			if(lottos[i] == 0) { //0인 경우의 수
				max++;
			}

			for (int j = 0; j < win_nums.length; j++) {
				//같은 번호가 있으면 cnt++;
				if(lottos[i] == win_nums[j]) {
					cnt++;
				}
			}
		}
		//순위 변수
		int best = Math.min(6, 7 - (cnt + max)); 
		int worst = Math.min(6, 7 - cnt);

		return new int[] {best, worst};
	}
}
