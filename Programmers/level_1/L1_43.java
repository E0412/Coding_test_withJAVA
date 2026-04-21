package level_1;

//콜라 문제
public class L1_43 {
	public int solution(int a, int b, int n) {
		int answer = 0;

		while(n >= a) {
			int cnt = n / a; //교환 가능한 횟수
			int remain = n % a; //남은 병의 수

			answer += cnt * b;
			n = cnt * b + remain; //새 병 + 남은 병
		}
		return answer;
	}
}
