package level_0;

//첫 번째로 나오는 음수
public class L0_45 {
	public int solution(int[] num_list) {
		int answer = 0;

		for (int i = 0; i < num_list.length; i++) {
			if(num_list[i] < 0) {
				answer = i;
				break; //음수인 경우 return
			} else {
				answer = -1;
			}
		}
		return answer;
	}
}
