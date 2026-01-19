package level_0;

//숨어있는 숫자의 덧셈 (2)
public class L0_133 {
	public int solution(String my_string) {
		int answer = 0;
		String s[] = my_string.split("[a-zA-Z]+");
		for(String out : s) {
			if(!out.equals("")) {
				answer += Integer.parseInt(out);
			}
		}
		return answer;
	}
}
