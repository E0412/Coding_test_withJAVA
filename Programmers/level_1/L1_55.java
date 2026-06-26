package level_1;

//소수 만들기
public class L1_55 {
	boolean chk(int n) {
		for (int i = 0; i * i <= n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int solution(int[] nums) {
		int answer = -1;

		int lt = 0;
		int rt = lt + 1;

		//경우의 수 + 소수 구하기
		for (int i = 0; i < nums.length; i++) {

		}
		return answer;
	}
}
