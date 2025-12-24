package level_0;

//외계행성의 나이
public class L0_111 {
	public String solution(int age) {
		StringBuilder sb = new StringBuilder();
		String s = String.valueOf(age);
		for(int i = 0; i < s.length(); i++) {
			int num = 97 + (s.charAt(i) - '0'); //정수형 계산을 하고 변환해야함
			sb.append((char) num);
		}
		return sb.toString();
	}
}
