package level_2;

//영어 끝말잇기
public class L2_26 {
	public int[] solution(int n, String[] words) {
		int[] answer = new int[2]; //가장 먼저 탈락하는 번호, 탈락 순서

		int num = 2;
		for(int i = 1; i < words.length; i++) {
			String s = String.valueOf(words[i - 1].charAt(words[i - 1].length() - 1));
			if(words[i].startsWith(s)) {
				num++;
				//이전에 나온 단어인지 검증 필요
			}
			if(num > 3) {

			}
		}

		return answer;
	}
}
