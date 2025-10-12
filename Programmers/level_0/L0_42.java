package level_0;

//글자 지우기
public class L0_42 {
	public String solution(String my_string, int[] indices) {
		String answer = "";

		String[] arr = my_string.split("");

		for(int i = 0; i < indices.length; i++) {
			arr[indices[i]] = ""; //빈 문자열로 대체
		}

		for(String s : arr) {
			answer += s;
		}

		return answer;
	}
}
