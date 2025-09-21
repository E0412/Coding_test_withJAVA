package level_0;

//수열과 구간쿼리 2
public class L0_23 {
	public int[] solution(int[] arr, int[][] queries) {

		int[] result = new int[queries.length];

		for (int i = 0; i < queries.length; i++) {
			//queries의 원소
			int s = queries[i][0];
			int e = queries[i][1];
			int k = queries[i][2];

			int min = Integer.MAX_VALUE; //최소값

			//k보다 크면서 가장 작은 arr[j]를 찾는다
			for (int j = s; j <= e; j++) {
				if(arr[j] < min && k < arr[j]) {
					min = arr[j];
				}
			}

			//쿼리의 순서에 맞게 답 저장 
			if(min != Integer.MAX_VALUE) {
				result[i] = min; 
			} else {
				result[i] = -1; 
			}
		}
		return result;
	}
}
