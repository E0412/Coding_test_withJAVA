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
		int best = 0; 
		int worst = 0;

		//*수정필요 : 랭킹 구하는 로직 생각해보기 
		if(max + cnt == 6 || cnt == 6) {
			
		} else if (max + cnt == 5 || cnt == 5) {

		} else if (max + cnt == 4 || cnt == 4) {

		} else if (max + cnt == 3 || cnt == 3) {

		} else if (max + cnt == 2 || cnt == 2) {

		} else if (max + cnt == 1 || cnt == 1) {

		} else if (max + cnt == 0 || cnt == 0) {

		}

		return new int[] {best, worst};
	}
}
