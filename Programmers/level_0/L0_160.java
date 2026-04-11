package level_0;

import java.util.Arrays;

//최댓값 만들기 (1)
public class L0_160 {
	public int solution(int[] numbers) {
		Arrays.sort(numbers);
		return numbers[numbers.length-1] * numbers[numbers.length-2];
	}
}
