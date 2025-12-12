package level_0;

//문자열 계산하기
public class L0_103 {
	public int solution(String my_string) {
		String[] arr = my_string.split(" ");
		int answer = Integer.parseInt(arr[0]); //첫번째 숫자 저장

		//연산은 여러번 발생할 수 있음
		for (int i = 1; i < arr.length; i += 2) {
			if(arr[i].equals("+")) {
				answer += Integer.parseInt(arr[i+1]);
			} else {
				answer -= Integer.parseInt(arr[i+1]);
			}
		}
		return answer;
	}
}
