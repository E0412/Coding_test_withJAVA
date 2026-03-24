package level_1;

//시저 암호
public class L1_33 {
	public String solution(String s, int n) {
		StringBuilder sb = new StringBuilder();

		for(char c : s.toCharArray()) {
			//공백 처리
			if(c == ' ') {
				sb.append(" ");
			}
			//소문자
			else if (c >= 'a' && c <= 'z' ) {
				//a를 기준으로 숫자화 후 n만큼 이동한 값을 26으로 나눈 나머지를 문자화
				char ch = (char) ((c - 'a' + n) % 26 + 'a'); 
				sb.append(ch);
			}
			//대문자
			else if (c >= 'A' && c <= 'Z' ) {
				char ch = (char) ((c - 'A' + n) % 26 + 'A'); 
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
