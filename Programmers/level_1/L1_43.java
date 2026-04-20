package level_1;

//콜라 문제
public class L1_43 {
	public int solution(int a, int b, int n) {
		int answer = 0;
		//실패 : 1개가 모자란 결과가 나옴 
		while(n > 0) {
			if(n % a == 0) {
				n /= a;
				answer += n * b;
			} else {
				n /= a;
				answer += n * b;
				n += (n % a);
			}
		}
		return answer;
	}
}
