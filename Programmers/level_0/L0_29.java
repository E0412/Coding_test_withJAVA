package level_0;

//글자 이어 붙여 문자열 만들기
public class L0_29 {
	public String solution(String my_string, int[] index_list) {
		String answer = "";

		for (int i = 0; i < index_list.length; i++) {
			char ch = my_string.charAt(index_list[i]);
			answer += ch;
		}
		return answer;
	}
}
