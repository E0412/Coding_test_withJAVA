package level_2;

//올바른 괄호
public class L2_02 {
	boolean solution(String s) {
		boolean answer = false;
		int cnt = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				cnt++;
			} else {
				cnt--;
			}
			if(cnt < 0) {
				break;
			}
		}
		//return cnt == 0;으로 축약가능
		if(cnt == 0) {
			answer = true;   
		}
		return answer;
	}
}
