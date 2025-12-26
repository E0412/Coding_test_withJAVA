package level_0;

//컨트롤 제트
public class L0_113 {
	public int solution(String s) {
		String[] arr = s.split(" ");
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals("Z")) {
				answer -= Integer.parseInt(arr[i-1]);
			}
			else {
				answer += Integer.parseInt(arr[i]);
			}
		}
		return answer;
	}
}
