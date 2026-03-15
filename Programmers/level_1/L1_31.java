package level_1;

//이상한 문자 만들기
public class L1_31 {
	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		int n = 0;

		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				sb.append(" ");
				n = 0; //짝수로 초기화
			} else {
				if(n % 2 == 0) { //짝수
					sb.append(Character.toUpperCase(s.charAt(i)));
				} else { //홀수
					sb.append(Character.toLowerCase(s.charAt(i)));
				}
				n++; //공백이 없는경우 인덱스 진행
			}
		}
		return sb.toString();
	}
}
