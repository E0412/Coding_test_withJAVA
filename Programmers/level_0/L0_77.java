package level_0;

import java.util.*;

//뒤에서 5등까지
public class L0_77 {
	public int[] solution(int[] num_list) {
		Arrays.sort(num_list);
		//앞에서 5번째까지 저장
		int[] answer = Arrays.copyOfRange(num_list, 0, 5);
		return answer;
	}
}
