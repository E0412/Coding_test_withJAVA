package level_0;

//구슬을 나누는 경우의 수
public class L0_140 {
	public int solution(int balls, int share) {
		long answer = 1;
		share = Math.min(share, balls-share); //조합은 대칭이라 작은쪽으로 계산

		for (int i = 1; i <= share; i++) {
			answer = answer * (balls - i + 1) / i;
		}
		return (int) answer;
	}
}
