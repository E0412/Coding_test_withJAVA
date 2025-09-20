package level_0;

//수열과 구간 쿼리 3
public class L0_22 {
	public int[] solution(int[] arr, int[][] queries) {
		/*
		 * queries 의 첫번째 인덱스인 query[i,j]의 숫자가 0,3이라면, 
		 * arr배열의 0번째 인덱스와 3번째 인덱스의 위치를 서로 바꾼다
		 */
		for (int i = 0; i < queries.length; i++) {
			int tmp = arr[queries[i][0]];
			arr[queries[i][0]] = arr[queries[i][1]];
			arr[queries[i][1]] = tmp;
		}

		return arr;
	}
}
