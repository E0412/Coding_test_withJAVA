package level_0;

//숨어있는 숫자의 덧셈 (1)
public class L0_165 {
	public int solution(String my_string) {
		int answer = 0;
		for (int i = 0; i < my_string.length(); i++) {
			if(!Character.isAlphabetic(my_string.charAt(i))) {
				answer += my_string.charAt(i) - '0';
			}
		}
		return answer;
	}
}
