package level_0;

//영어가 싫어요
public class L0_142 {
	public long solution(String numbers) {
		String[] text = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		for(int i = 0; i < num.length; i++) {
			numbers = numbers.replaceAll(text[i], num[i]);
		}
		return Long.parseLong(numbers);
	}
}
