package level_1;

//덧칠하기
public class L1_56 {
	public int solution(int n, int m, int[] section) {
		int answer = 1;

		int start = section[0];
		int end = start + m - 1;

		for(int i : section) {
			if(i > end) {
				start = i;
				end = start + m - 1;
				answer++;
			}
		}
		return answer;
	}
}
