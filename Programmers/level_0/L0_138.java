package level_0;

//짝수 홀수 개수
public class L0_138 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[2];
		for(int i = 0; i < num_list.length; i++) {
			if(num_list[i] % 2 == 0) {
				answer[0]++;
			} else {
				answer[1]++;
			}
		}
		return answer;
	}
}
