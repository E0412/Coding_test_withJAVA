package level_0;

//자릿수 더하기
public class L0_171 {
	public int solution(int n) {
		int answer = 0;
		String s = String.valueOf(n);
		for(int i = 0; i < s.length(); i++) {
			answer += (int) (s.charAt(i) - '0');
		}
		return answer;
	}
}
