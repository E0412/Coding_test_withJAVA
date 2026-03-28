package level_1;

//자릿수 더하기
public class L1_36 {
	public int solution(int n) {
		String s = String.valueOf(n);
		int answer = 0;
		for(int i = 0; i < s.length(); i++) {
			answer += s.charAt(i) - '0';
		}
		return answer;
	}
}
