package level_0;

//0 떼기
public class L0_85 {
	public String solution(String n_str) {
		int cnt = 0;
		for (int i = 0; i < n_str.length(); i++) {
			if(n_str.charAt(i) == '0') {
				cnt++;
			}	
			if(n_str.charAt(i) != '0') break;
		}
		String answer = n_str.substring(cnt, n_str.length());
		return answer;
	}
}
