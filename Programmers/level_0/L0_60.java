package level_0;

//길이에 따른 연산
public class L0_60 {
	public int solution(int[] num_list) {
		int num = 1;

		for (int i = 0; i < num_list.length; i++) {
			if(num_list.length >= 11) {
				num += num_list[i];
			} else if(num_list.length <= 10) {
				num *= num_list[i];
			}
		}
		int answer = (num_list.length >= 11) ? num - 1 : num;
		return answer;
	}
}
