package level_0;

//뒤집힌 문자열
public class L0_145 {
	public String solution(String my_string) {
		StringBuilder sb = new StringBuilder(my_string);
		return sb.reverse().toString();
	}
}
