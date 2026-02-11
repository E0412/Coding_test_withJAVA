package level_1;

//없는 숫자 더하기
public class L1_13 {
	public int solution(int[] numbers) {
		int answer = 45;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < numbers.length; j++) {
				if(numbers[j] == i) {
					answer -= numbers[j];
				}
			}
		}
		return answer;
	}
}
