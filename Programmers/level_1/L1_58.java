package level_1;

//둘만의 아웃
public class L1_58 {
	public String solution(String s, String skip, int index) {
		String answer = "";

		//skip과 초과하는 경우, z이후 추가 필요
		for(char c : s.toCharArray()) {
			answer += (char) (c + index);
		}

		return answer;
	}
}
