package level_0;

//분수의 덧셈
public class L0_184 {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];
		int m = Math.max(denom1, denom2) / Math.min(denom1, denom2);

		if(Math.max(denom1, denom2) % Math.min(denom1, denom2) != 0) {
			answer[0] = (numer1 * denom2) + (numer2 * denom1);
			answer[1] = denom1 * denom2;
		} else {
			if(denom1 > denom2) {
				answer[0] = numer1 + numer2 * m;
				answer[1] = denom1;
			} else {
				answer[0] = numer1 * m + numer2;
				answer[1] = denom2;
			}
		}
		return answer;
	}
}
