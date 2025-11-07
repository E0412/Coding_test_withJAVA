package level_0;

//간단한 식 계산하기
public class L0_70 {
	public int solution(String binomial) {
		String[] s = binomial.split(" ");

		int a = Integer.parseInt(s[0]);
		String op = s[1];
		int b = Integer.parseInt(s[2]);

		int answer = 0;
		if(op.equals("+")) {
			answer = a + b;
		} else if(op.equals("-")) {
			answer = a - b;
		} else if(op.equals("*")) {
			answer = a * b;
		} 
		return answer;
	}
}
