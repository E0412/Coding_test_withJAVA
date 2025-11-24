package level_0;

//꼬리 문자열
public class L0_86 {
	public String solution(String[] str_list, String ex) {
		String answer = "";
		for(String s : str_list) {
			if(!s.contains(ex)) {
				answer += s;
			}
		}
		return answer;
	}
}
