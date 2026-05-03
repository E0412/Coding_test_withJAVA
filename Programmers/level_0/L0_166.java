package level_0;

//대문자와 소문자
public class L0_166 {
	public String solution(String my_string) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < my_string.length(); i++) {
			if(my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90) {
				sb.append(Character.toLowerCase(my_string.charAt(i)));            
			} else if(my_string.charAt(i) >= 97 && my_string.charAt(i) <= 122) {
				sb.append(Character.toUpperCase(my_string.charAt(i)));             
			}
		}
		return sb.toString();
	}
}
