package level_0;

//특정 문자 제거하기
public class L0_164 {
	public String solution(String my_string, String letter) {
		String answer = my_string.replace(letter, "");
		return answer;
	}
}
