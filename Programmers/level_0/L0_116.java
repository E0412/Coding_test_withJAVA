package level_0;

//피자 나눠 먹기 (2)
public class L0_116 {
	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= 100; i++) {
			int pizza = i * 6;

			if(pizza % n == 0) {
				answer = pizza / 6;
				break;
			}
		}
		return answer;
	}
}
