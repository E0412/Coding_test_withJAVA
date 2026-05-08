package level_0;

import java.util.*;

//n의 배수 고르기 
public class L0_170 {
	public int[] solution(int n, int[] numlist) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < numlist.length; i++) {
			if(numlist[i] % n == 0) {
				list.add(numlist[i]);
			}
		}
		return list.stream().mapToInt(i -> i).toArray();
	}
}
