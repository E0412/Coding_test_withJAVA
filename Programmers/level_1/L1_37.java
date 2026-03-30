package level_1;

//자연수 뒤집어 배열로 만들기
public class L1_37 {
	public int[] solution(long n) {
		String s = String.valueOf(n);
		int[] answer = new int[s.length()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = s.charAt(s.length() - 1 - i) - '0'; //뒤에서부터 저장
		}
		return answer;
	}
}
