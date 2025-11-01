package level_0;

import java.util.Arrays;

//조건에 맞게 수열 변환하기 2
public class L0_63 {
	public int solution(int[] arr) {
		int cnt = 0;

		while(true) {
			int[] next = arr.clone(); //비교할 배열

			for (int i = 0; i < arr.length; i++) {
				//50보다 크거나 같은 짝수
				if(arr[i] >= 50 && arr[i] % 2 == 0) {
					next[i] = arr[i] / 2;  
				} 
				//50보다 작은 홀수
				else if(arr[i] < 50 && arr[i] % 2 == 1) {
					next[i] = arr[i] * 2 + 1;  
				}
			}
			//두 배열이 같은 경우 종료
			if(Arrays.equals(arr, next)) { //풀이 참고
				break;
			}
			arr = next;
			cnt++;
		}
		return cnt;
	}
}
