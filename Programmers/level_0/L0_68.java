package level_0;

//x 사이의 개수
public class L0_68 {
	public int[] solution(String myString) {
		String[] s = myString.split("x", -1); //-1 -> 빈 문자열 포함
		int[] answer = new int[s.length];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = s[i].length(); 
		}
		return answer;
	}
}
