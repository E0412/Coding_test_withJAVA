package level_0;

//문자열이 몇 번 등장하는지 세기
public class L0_65 {
	public int solution(String myString, String pat) {
		int cnt = 0;

		for (int i = 0; i < myString.length(); i++) {
			String s = myString.substring(0, i + 1);
			if(s.endsWith(pat)) cnt++;
		}
		return cnt;
	}
}
