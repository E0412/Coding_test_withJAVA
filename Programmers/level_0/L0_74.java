package level_0;

//배열 비교하기
public class L0_74 {
	public int solution(int[] arr1, int[] arr2) {
		int sum1 = 0;
		int sum2 = 0;

		int answer = 0;
		if(arr1.length > arr2.length) {
			answer = 1;
		} else if(arr1.length < arr2.length) {
			answer = -1;
		} 
		else if(arr1.length == arr2.length) {
			for (int i = 0; i < arr2.length; i++) {
				sum1 += arr1[i];
				sum2 += arr2[i];
			}
			if(sum1 > sum2) {
				answer = 1;
			} else if(sum1 < sum2) {
				answer = -1;
			} else if(sum1 == sum2) {
				answer = 0;
			}
		}
		return answer;
	}
}
