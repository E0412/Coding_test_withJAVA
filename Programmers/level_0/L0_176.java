package level_0;

//배열 뒤집기
public class L0_176 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];
		int idx = 0;
		for(int i = num_list.length - 1; i >= 0; i--) {
			answer[idx] = num_list[i];
			idx++;
		}
		return answer;
	}
}
