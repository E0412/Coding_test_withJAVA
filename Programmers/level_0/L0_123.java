package level_0;

//한 번만 등장한 문자
public class L0_123 {
	public String solution(String s) {
		int cnt[] = new int[26];
		//등장하는 빈도 수 저장
		for (int i = 0; i < s.length(); i++) {
			cnt[s.charAt(i) - 'a']++;
		}
		StringBuilder sb = new StringBuilder();
		//cnt가 1인 문자만 저장
		for (int i = 0; i < cnt.length; i++) {
			if(cnt[i] == 1) {
				sb.append((char) (i + 'a'));
			}
		}
		return sb.toString();        
	}
}
