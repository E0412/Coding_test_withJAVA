package level_0;

//조건에 맞게 수열 변환하기 1
public class L0_58 {
	public int[] solution(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			//50보다 크거나 같은 짝수인 경우 2로 나눈다
			if(arr[i] % 2 == 0 && arr[i] >= 50) {
				arr[i] /= 2;
			} 
			//50보다 작은 홀수인 경우 2를 곱한다
			else if(arr[i] % 2 == 1 && arr[i] < 50) {
				arr[i] *= 2;
			}
		}
		return arr;
	}
}
