package level_1;

//3진법 뒤집기
public class L1_34 {
	public int solution(int n) {
		StringBuilder sb = new StringBuilder();
		while(n > 0) {
			sb.append(n % 3);
			n /= 3;
		}
		int answer = Integer.parseInt(sb.toString(), 3); //문자열을 n진법으로 해석하여 10진수로 출력
		return answer;
	}
}
