package level_1;

//둘만의 아웃
public class L1_58 {
	public String solution(String s, String skip, int index) {
		String answer = "";

		for(char c : s.toCharArray()) {
			int cnt = 0;
			char cur = c; //현재 문자

			while(cnt < index) {
				cur++; //문자 하나씩 이동

				//z를 넘어가면 다시 a로
				if(cur > 'z') {
					cur = 'a';
				}
				//skip에 있는지 검증
				if(skip.contains(String.valueOf(cur))) {
					continue;
				}
				cnt++;
			}
			answer += cur;
		}
		return answer;
	}
}
