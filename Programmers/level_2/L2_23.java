package level_2;

//행렬의 곱셈
public class L2_23 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2.length];

		/* 행렬 곱
		 * arr1[0][0] * arr2[0][0] + arr1[0][1] * arr2[1][0]
		 */
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				answer[i][j] = arr1[i][j] * arr2[i][j] + arr1[i][j + 1] * arr2[i + 1][j];  
			}
		}

		return answer;
	}
}
