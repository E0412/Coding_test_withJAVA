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

		int max = Math.max(denom1, denom2);
		int min = Math.min(denom1, denom2);
		int d = max / min;

		int n = gcd(min, max);
		//수정 : 최대 공약수와 최소 공배수를 이용
		//배수 관계인 경우 : 최대공약수
		if(max % min == 0) {
			if(denom1 > denom2) {
				answer[0] = numer1 + numer2 * d;
				answer[1] = max;
			} else {
				answer[0] = numer1 * d + numer2;
				answer[1] = max;
			}
		} 
		//배수 관계가 아닌 경우 : 최소공배수
		else {
			int m = denom1 * denom2 / gcd(min, max);
			answer[0] = numer1 * (m / denom1) + numer2 * (m / denom2);
			answer[1] = m;
		}

		int g = gcd(answer[0], answer[1]);
		answer[0] /= g;
		answer[1] /= g;

		return answer;
	}
}
