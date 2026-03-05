package level_1;

import java.util.*;

//최대공약수와 최소공배수
public class L1_30 {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];

		Set<Integer> gcd = new HashSet<Integer>();

		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				gcd.add(i);
			}
		}
		//최대공약수 구하기
		for(int i = 1; i <= m; i++) {
			if(m % i == 0 && gcd.contains(i)) {
				answer[0] = Math.max(answer[0], i);
			}
		}
		//최소공배수 = 두 수의 곱 / 최대공약수
		answer[1] = n * m / answer[0];
		return answer;
	}
}
