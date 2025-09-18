package level_0;

//수 조작하기 2
public class L0_20 {
	public String solution(int[] numLog) {
		String ans = "";

		for (int i = 1; i < numLog.length; i++) {
			//arr[0], 즉 이전 값과 비교하여 변한 값에 대하여 저장
			if(numLog[i] == (numLog[i-1] + 1)) {
				ans += "w";
			} 
			else if(numLog[i] == (numLog[i-1] -1)) {
				ans += "s";
			}
			else if(numLog[i] == (numLog[i-1] +10)) {
				ans += "d";
			}
			else if(numLog[i] == (numLog[i-1] -10)) {
				ans += "a";
			}
		}

		return ans;
	}
}
