package level_0;

//분수의 덧셈
public class L0_184 {
	int gcd(int a, int b) {
		while(b != 0) {
			int tmp = a % b;
			a = b;
			b = tmp;
		}
		return a;
	}

	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];

		//수정2 : 최소공배수를 이용
		int n = denom1 * denom2 / gcd(denom1, denom2);
		answer[0] = numer1 * (n / denom1) + numer2 * (n / denom2);
		answer[1] = n;

		int g = gcd(answer[0], answer[1]);
		answer[0] /= g;
		answer[1] /= g;

		return answer;
	}
}
