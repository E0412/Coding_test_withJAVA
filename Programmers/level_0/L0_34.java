package level_0;

//부분 문자열 이어 붙여 문자열 만들기
public class L0_34 {
	public String solution(String[] my_strings, int[][] parts) {
		String answer = "";

		for (int i = 0; i < parts.length; i++) {
			int s = parts[i][0];
			int e = parts[i][1];

			String sub = my_strings[i].substring(s, e+1);
			answer += sub;
		}
		return answer;
	}
}
