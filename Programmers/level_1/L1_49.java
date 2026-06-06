package level_1;

//기사단원의 무기
public class L1_49 {
	//약수의 개수 반환
	int count(int n) {
		int cnt = 0;

		for(int i = 1; i * i <= n; i++) {
			if(n % i == 0) {
				if(i * i == n) cnt++;
				else cnt += 2; //약수의 순서쌍
			}
		}
		return cnt;
	}

	public int solution(int number, int limit, int power) {
		int answer = 0;

		for(int i = 1; i <= number; i++) {
			int cnt = count(i);

			if(cnt <= limit) {
				answer += cnt;
			} else {
				answer += power;
			}
		}
		return answer;
	}
}
