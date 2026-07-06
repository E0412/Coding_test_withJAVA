package level_2;

//예상 대진표
public class L2_27 {
	public int solution(int n, int a, int b) {
		int answer = 0;

		//2^n의 n을 정답으로 생각(실패) -> a와 b 값을 조정하면서 구해야 함
		while(a != b) {
			answer++;
			a = (a + 1) / 2;
			b = (b + 1) / 2;
		}
		return answer;
	}
}
