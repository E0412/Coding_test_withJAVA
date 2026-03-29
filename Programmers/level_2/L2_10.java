package level_2;

import java.util.Arrays;

//최솟값 만들기
public class L2_10 {
	public int solution(int []A, int []B) {
		int answer = 0;
		int idx = B.length - 1;

		Arrays.sort(A);
		Arrays.sort(B);
		for(int i = 0; i < A.length; i++) {
			answer += A[i] * B[idx];
			idx--;
		}
		return answer;
	}
}
