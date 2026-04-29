package level_1;

//숫자 문자열과 영단어
public class L1_45 {
	public int solution(String s) {
		int answer = 0;
		StringBuilder sb = new StringBuilder();

		//숫자가 맨 마지막에 추가되어 값이 제대로 출력되지 않음
		while(!s.isEmpty()) {
			if(s.contains("one")) {
				sb.append("1");
				s = s.replaceFirst("one", "");
			} 
			else if(s.contains("two")) {
				sb.append("2");
				s = s.replaceFirst("two", "");
			}
			else if(s.contains("three")) {
				sb.append("3");
				s = s.replaceFirst("three", "");
			}
			else if(s.contains("four")) {
				sb.append("4");
				s = s.replaceFirst("four", "");
			}
			else if(s.contains("five")) {
				sb.append("5");
				s = s.replaceFirst("five", "");
			}
			else if(s.contains("six")) {
				sb.append("6");
				s = s.replaceFirst("six", "");
			}
			else if(s.contains("seven")) {
				sb.append("7");
				s = s.replaceFirst("seven", "");
			}
			else if(s.contains("eight")) {
				sb.append("8");
				s = s.replaceFirst("eight", "");
			}
			else if(s.contains("nine")) {
				sb.append("9");
				s = s.replaceFirst("nine", "");
			} 
			//문제점
			else {
				sb.append(s.charAt(0));
				s = s.replace(String.valueOf(s.charAt(0)), "");
			}
		}
		return Integer.parseInt(sb.toString());
	}
}
