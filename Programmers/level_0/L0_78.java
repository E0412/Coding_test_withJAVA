package level_0;

//배열의 길이에 따라 다른 연산하기
public class L0_78 {
	public int[] solution(int[] arr, int n) {
		int answer[] = arr.clone();
		for (int i = 0; i < arr.length; i++) {
			//짝수 길이, 홀수 인덱스
			if(arr.length % 2 == 0 && i % 2 != 0) {
				answer[i] += n; 
			} 
			//홀수 길이, 짝수 인덱스
			else if(arr.length % 2 != 0 && i % 2 == 0) {
				answer[i] += n; 
			}
		}
		return answer;
	}
}
