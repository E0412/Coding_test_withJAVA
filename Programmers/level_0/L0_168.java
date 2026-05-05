package level_0;

//문자열안에 문자열
public class L0_168 {
	public int solution(String str1, String str2) {
		return str1.contains(str2) ? 1 : 2;
	}
}
