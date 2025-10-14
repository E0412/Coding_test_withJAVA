package level_0;

//문자 개수 세기
public class L0_44 {
	public int[] solution(String my_string) {
		int[] answer = new int[52];

		for (int i = 0; i < my_string.length(); i++) {
			char ch = my_string.charAt(i);

			//소문자의 순서가 뒤에 오기 때문에 26을 더한다
			if(ch >= 'a' && ch <= 'z') {
				answer[26 + ch - 'a']++;
			}
			else if(ch >= 'A' && ch <= 'Z') {
				answer[ch -'A']++;
			}
		}
		return answer;
	}
}
