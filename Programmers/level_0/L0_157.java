package level_0;

//다항식 더하기
public class L0_157 {
	public String solution(String polynomial) {
		StringBuilder sb = new StringBuilder();

		String[] sArr = polynomial.split(" \\+ ");
		int xNum = 0;
		int num = 0;

		for(String s : sArr) {
			if(s.contains("x")) { //2x 5x
				if(s.equals("x")) {
					xNum++;
				} else {
					//x의 계수만 더한다
					xNum += Integer.parseInt(s.replace("x", ""));
				}
			} else { //정수
				num += Integer.parseInt(s);
			}
		}
		//x의 계수가 1이라 생략하는 경우
		if(xNum == 1) {
			if(num > 0) sb.append("x").append(" + ").append(num);
			else sb.append("x");
		} else if(xNum == 0) { //x가 없는 경우
			sb.append(num);
		} else {
			if(num == 0) sb.append(xNum).append("x");
			else sb.append(xNum).append("x").append(" + ").append(num);
		}
		return sb.toString();
	}
}
