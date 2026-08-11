package level_1;

//문자열 나누기
public class L1_57 {
	public int solution(String s) {
		int answer = 0;

		int x = 0;
		int y = 0;

		char c = s.charAt(0); //비교할 단어
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				x++;
			} else {
				y++;
			}
			if(x == y) {
				answer++;
				x = 0;
				y = 0;

				//비교할 문자가 남아 있는 경우 
				if(i + 1 < s.length()) {
					c = s.charAt(i + 1);
				}
			}
		}

		//x와 y 중 하나에 문자가 남아있는 경우
		if(x != 0 || y != 0) {
			answer++;
		}

		return answer;
	}
}
