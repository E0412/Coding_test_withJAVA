package level_0;

//문자 리스트를 문자열로 반환하기
public class L0_09 {

	static String answer = "";

	static String solution(String[] arr) {

		for(String s : arr) {
			answer += s;
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] arr = {"a","b","c"};

		System.out.print(solution(arr)); //return answer;
	}
}
