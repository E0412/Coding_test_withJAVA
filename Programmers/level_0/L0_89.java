package level_0;

//조건에 맞게 수열 변환하기 3
public class L0_89 {
	public int[] solution(int[] arr, int k) {
		for(int i = 0; i < arr.length; i++) {
			if(k % 2 == 1) {
				arr[i] *= k;
			} else if(k % 2 == 0) {
				arr[i] += k;
			}
		}
		return arr;
	}
}
