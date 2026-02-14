package level_1;

//가운데 글자 가져오기
public class L1_16 {
	public String solution(String s) {
		int half = s.length()/2;
		StringBuilder sb = new StringBuilder();
		//짝수인 경우 가운데 두 글자 반환
		if(s.length() % 2 == 0) {
			sb.append(s.charAt(half-1)).append(s.charAt(half));
		} else {
			sb.append(s.charAt(half));
		}
		return sb.toString();
	}
}
