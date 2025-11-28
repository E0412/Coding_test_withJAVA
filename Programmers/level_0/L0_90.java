package level_0;

//그림 확대
public class L0_90 {
	public String[] solution(String[] picture, int k) {
		String[] answer = new String[picture.length * k];
		int n = 0;

		for (int i = 0; i < picture.length; i++) {
			StringBuilder sb = new StringBuilder(); //세로
			//가로 repeat()으로 복사
			for (int j = 0; j < picture[i].length(); j++) {
				sb.append(String.valueOf(picture[i].charAt(j)).repeat(k));
			}
			//세로 배열 추가
			for (int l = 0; l < k; l++) {
				answer[n++] = sb.toString();
			}
		}
		return answer;
	}
}
