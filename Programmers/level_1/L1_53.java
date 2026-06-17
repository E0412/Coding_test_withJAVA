package level_1;

//옹알이 (2) 
public class L1_53 {
	public int solution(String[] babbling) {
		int answer = 0;
		String[] arr = {"aya", "ye", "woo", "ma"};

		for(int i = 0; i < babbling.length; i++) {
			String s = babbling[i];
			boolean chk = true;

			//같은 단어가 반복되는지 검증
			for (String re : arr) {
				if(s.contains(re + re)) {
					chk = false;
					break;
				}
			}
			//발음 가능한 문자열들 다 지웠을 때 빈 문자열이 되는지 검증
			for(int j = 0; j < arr.length; j++) {
				s = s.replace(arr[j], "");
			}

			//반복되는 같은 단어가 없으면서 빈 문자열
			if(chk && s.isEmpty()) {
				answer++;
			}
		}
		return answer;
	}
}
