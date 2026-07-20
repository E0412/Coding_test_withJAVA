package level_2;

//모음사전
public class L2_30 {
	public int solution(String word) {
		int answer = 0;

		char[] ch = word.toCharArray();
		int[] arr = {781, 156, 31, 6, 1}; //가중치
		char[] cArr = {'A', 'E', 'I', 'O', 'U'};

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < cArr.length; j++) {
				if(ch[i] == cArr[j]) {
					answer += (j * arr[i]) + 1;
				}
			}
		}

		return answer;
	}
}
