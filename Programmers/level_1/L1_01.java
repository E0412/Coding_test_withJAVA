package level_1;

//수박수박수박수박수박수?
public class L1_01 {

	class Solution {
		public String solution(int n) {
			String s = "수박";
			String repeat = s.repeat(5000); //10000이하여서 5000(*2)번 반복

			//0부터 n-1까지 잘라서 출력
			String answer = repeat.substring(0, n);

			return answer;
		}
	}
}
