package level_1;

//가장 가까운 같은 글자
public class L1_42 {
	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					answer[i] = j - i;
				} else {
					answer[i] = -1;
				}
			}
		}
		return answer;
	}
}
