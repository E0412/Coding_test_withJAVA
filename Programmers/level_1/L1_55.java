package level_1;

//소수 만들기
public class L1_55 {
	boolean chk(int n) {
		if(n < 2) return false;
		for (int i = 2; i * i <= n; i++) { //i는 2부터 시작
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int solution(int[] nums) {
		int answer = 0;

		//경우의 수 + 소수 구하기
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					if(chk(sum)) {
						answer++;
					}
				}
			}
		}
		return answer;
	}
}
