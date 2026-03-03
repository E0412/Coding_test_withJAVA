package level_1;

//약수의 개수와 덧셈
public class L1_28 {
	public int solution(int left, int right) {
		int answer = 0;
		//left~right 사이를 순회하여 더하고 약수의 개수가 홀수인 완전제곱수를 빼는 문제이다
		for (int i = left; i <= right; i++) {
			int n = (int) Math.sqrt(i); //제곱근
			if(n * n == i) {
				answer -= i;
			} else {
				answer += i;
			}
		}
		return answer;
	}
}
