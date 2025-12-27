package level_0;

//공 던지기
public class L0_114 {
	public int solution(int[] numbers, int k) {
		int answer = (2 * (k - 1)) % numbers.length;
		return numbers[answer];
	}
}
