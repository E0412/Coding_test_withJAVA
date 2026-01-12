package level_0;

//k의 개수
public class L0_127 {
	public int solution(int i, int j, int k) {
		int answer = 0;
		char k_ch = (char) ('0' + k);
		for(int n = i; n <= j; n++) {
			String s = String.valueOf(n);
			for(int m = 0; m < s.length(); m++) {
				if(k_ch == s.charAt(m)) {
					answer++;
				}
			}
		}
		return answer;
	}
}
