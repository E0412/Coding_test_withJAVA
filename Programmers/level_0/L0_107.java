package level_0;

import java.util.Arrays;

//중앙값 구하기
public class L0_107 {
	public int solution(int[] array) {
		Arrays.sort(array);
		int answer = array[array.length/2];
		return answer;
	}
}
