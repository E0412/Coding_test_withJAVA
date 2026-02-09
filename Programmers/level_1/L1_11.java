package level_1;

//문자열 내 p와 y의 개수
public class L1_11 {
	boolean solution(String s) {
		int cnt_p = 0;
		int cnt_y = 0;
		String str = s.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'p') {
				cnt_p++;
			} else if(str.charAt(i) == 'y') {
				cnt_y++;
			}
		}
		return cnt_p == cnt_y ? true : false;
	}
}
