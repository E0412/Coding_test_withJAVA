package level_1;

//옹알이 (2) 
public class L1_53 {
	public int solution(String[] babbling) {
		int answer = 0;
		String[] arr = {"aya", "ye", "woo", "ma"};


		//modify : 순서에 따라서 단어를 삭제하는 방식 사용
		for (int i = 0; i < babbling.length; i++) {
			String s = babbling[i];
			int idx = 0; 
			String prev = ""; //이전값 저장
			boolean chk = true; //단어가 순서대로 있는지

			while(idx < s.length()) {
				boolean found = false; //해당하는 단어가 있는지 확인

				for(String str : arr) {
					//idx로 시작하는 문자열이 str로 시작하고 직전 단어와 다른경우
					if(s.substring(idx).startsWith(str) && !prev.equals(str)) {
						idx += str.length(); //단어 길이만큼 idx 이동 
						prev = str; //직전에 읽은 단어를 저장
						found = true; //읽을 수 있는 단어를 찾음
						break;
					}
				}
				if(!found) {
					chk = false;
					break;
				}
			}
			if(chk && idx == s.length()) answer++;
		}
		return answer;
	}
}
