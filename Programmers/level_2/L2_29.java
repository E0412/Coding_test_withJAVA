package level_2;

//뒤에 있는 큰 수 찾기
public class L2_29 {
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];

		answer[numbers.length-1] = -1;
		//89점 실패, 시간초과 -> 다른 방법 찾기
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] < numbers[j]) {
					answer[i] = numbers[j];
					break;
				} else {
					answer[i] = -1;
				}
			}
		}
		return answer;
	}
}
