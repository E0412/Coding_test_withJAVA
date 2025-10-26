package level_0;

//수열과 구간 쿼리1
public class L0_57 {
	public int[] solution(int[] arr, int[][] queries) {
		for (int i = 0; i < queries.length; i++) {
			int s = queries[i][0];
			int e = queries[i][1];

			for (int j = s; j <= e; j++) {
				arr[i] += 1;
			}
		}
		return arr;
	}
}
