package level_2;

//n^2 배열 자르기
public class L2_24 {
	public int[] solution(int n, long left, long right) {
		int[] answer = new int[(int) (right - left) + 1];
		int idx = 0;

		for (long i = left; i <= right; i++) {
			long row = i / n;
			long col = i % n;

			answer[idx] = (int) Math.max(row, col) + 1;
			idx++;
		}
		return answer;
	}
}
