package level_0;

//배열의 길이를 2의 거듭제곱으로 만들기
public class L0_79 {
	public int[] solution(int[] arr) {
		int len = arr.length;
		int tmp = 1; //2^0 = 1

		//배열의 길이에 근사한 2의 거듭제곱을 구한다
		while(tmp < len) {
			tmp *= 2;
		}

		int answer[] = new int[tmp];
		for (int i = 0; i < answer.length; i++) {
			if(len >= i) {
				answer[i] = arr[i];
			} else {
				answer[i] = 0;
			}
		}
		return answer;
	}
}
