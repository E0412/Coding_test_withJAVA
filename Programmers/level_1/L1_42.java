package level_1;

//가장 가까운 같은 글자
public class L1_42 {
	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		answer[0] = -1; //첫번째 인덱스는 -1
		for (int i = 0; i < s.length(); i++) {
			//반복문 역순으로 수정
			for (int j = i - 1; j >= 0; j--) {
				if(s.charAt(i) == s.charAt(j)) {
					answer[i] = i - j;
					break;
				} else {
					answer[i] = -1;
				}
			}
		}
		return answer;
	}
}
