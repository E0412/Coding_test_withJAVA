package level_2;

//JadenCase 문자열 만들기
public class L2_08 {
	public String solution(String s) {
		boolean flag = true; //첫번째 문자는 대문자
		StringBuilder sb = new StringBuilder();
		//공백인 경우 true -> 대문자로 출력 
		for(char ch : s.toCharArray()) {
			if(flag) {
				sb.append(Character.toUpperCase(ch));
			} else {
				sb.append(Character.toLowerCase(ch));            
			}    
			if(ch == ' ') {
				flag = true;
			} else {
				flag = false;
			}
		}
		return sb.toString();
	}
}
