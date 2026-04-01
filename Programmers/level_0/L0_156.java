package level_0;

//정수 제곱근 판별
public class L0_156 {
	public long solution(long n) {
		long m = (long) Math.sqrt(n); //비교할 수
		long answer = 0;
		if(m * m == n) {
			answer = (m + 1) * (m + 1);
		} else {
			answer = -1;
		}
		return answer;
	}
}
