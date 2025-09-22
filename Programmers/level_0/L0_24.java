package level_0;

//수열과 구간 쿼리 4
public class L0_24 {
	public int[] solution(int[] arr, int[][] queries) {
		for (int i = 0; i < queries.length; i++) {
			int s = queries[i][0];
			int e = queries[i][1];
			int k = queries[i][2];

			for (int j = s; j <= e; j++) {
				//j가 k의 배수인 경우 arr[i]에 1을 더한다
				if(j % k == 0) {
					arr[j] = arr[j] + 1;  
				}
			}
		}
		return arr;
	}
}
