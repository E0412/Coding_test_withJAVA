package level_0;

//중복된 숫자 개수
public class L0_159 {
	public int solution(int[] array, int n) {
		int answer = 0;
		for(int i : array) {
			if(i == n) {
				answer++;
			}
		}
		return answer;
	}
}
