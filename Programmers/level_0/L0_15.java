package level_0;

//등차수열의 특정한 항만 더하기
public class L0_15 {
	public int solution(int a, int d, boolean[] included) {
		int answer = 0;
		int num = a;

		for (int i = 0; i < included.length; i++) {

			if(included[i]) {
				answer += num;
			}
			num = num + d;
		}
		return answer;
	}
}
