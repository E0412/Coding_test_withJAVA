package level_0;

import java.util.*;

//뒤에서 5등 위로
public class L0_81 {
	public int[] solution(int[] num_list) {
		Arrays.sort(num_list);
		int[] answer = Arrays.copyOfRange(num_list, 5, num_list.length);
		return answer;
	}
}
