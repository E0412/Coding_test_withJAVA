package level_0;

//배열 두 배 만들기
public class L0_162 {
	public int[] solution(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] *= 2;
		}
		return numbers;
	}
}
