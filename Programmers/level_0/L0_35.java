package level_0;

import java.util.*;

//배열 만들기 5
public class L0_35 {
	public int[] solution(String[] intStrs, int k, int s, int l) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < intStrs.length; i++) {
			String str = intStrs[i].substring(s, s+l);

			if(Integer.parseInt(str) > k) {
				list.add(Integer.parseInt(str));
			}
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i); 
		}
		return answer;
	}
}
