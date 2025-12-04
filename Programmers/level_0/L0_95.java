package level_0;

import java.util.*;

//삼각형의 완성조건(1)
public class L0_95 {
	public int solution(int[] sides) {
		Arrays.sort(sides);
		int answer = 0;

		if(sides[0] + sides[1] > sides[2]) {
			answer = 1;
		} else {
			answer = 2;
		}
		return answer;
	}
}
