package level_1;

//소수 찾기
public class L1_54 {
	class Solution {

		//소수인지 체크
		boolean chk(int m) {
			for (int i = 2; i * i <= m; i++) {
				//나누어 떨어짐 -> 약수가 존재, 소수 아님
				if(m % i == 0) {
					return false;
				}
			}
			return true;
		}

		public int solution(int n) {
			int answer = 0;

			for (int i = 2; i <= n; i++) {
				if(chk(i)) {
					answer++;
				}
			}
			return answer;
		}
	}
}
