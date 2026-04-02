package level_0;

//다항식 더하기
public class L0_157 {
	public String solution(String polynomial) {
		StringBuilder sb = new StringBuilder();
		int num = 0;
		int constant = 0;
		for(int i = 1; i < polynomial.length(); i++) {
			if(polynomial.charAt(i) == 'x') {
				if(i == 0) {
					num++;
				}
				else if(polynomial.charAt(i-1) > '0') {
					num += polynomial.charAt(i - 1) - '0';
				} else if(polynomial.charAt(i-1) == ' ') {
					num++;
				}
			} 
			//숫자인 경우
			else if(polynomial.charAt(i) > 65) {
				constant = polynomial.charAt(i) - '0';
			}
		}
		//상수값을 가진경우와 아닌경우를 구분해야함
		sb.append(num).append("x");
		return sb.toString();
	}
}
