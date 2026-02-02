package level_1;

//크기가 작은 부분문자열
public class L1_05 {
	public int solution(String t, String p) {
		int answer = 0;
		for(int i = 0; i <= t.length()-p.length(); i++) {
			String s = t.substring(i, i + p.length());
			System.out.println(s);
			if(Long.parseLong(s) <= Long.parseLong(p)) {
				answer++;
			}
		}
		return answer;
	}
}
