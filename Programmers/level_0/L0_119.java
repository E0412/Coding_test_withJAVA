package level_0;

//인덱스 바꾸기
public class L0_119 {
	public String solution(String my_string, int num1, int num2) {
		StringBuilder sb = new StringBuilder(my_string);
		sb.setCharAt(num1, my_string.charAt(num2));
		sb.setCharAt(num2, my_string.charAt(num1));
		return sb.toString();
	}
}
