package level_2;

import java.util.*;

//영어 끝말잇기
public class L2_26 {
	public int[] solution(int n, String[] words) {
		int[] answer = new int[2]; //가장 먼저 탈락하는 번호, 탈락 순서

		int num = 0; //탈락하는 번호
		int round = 0; //회차

		Set<String> set = new HashSet<>();
		set.add(words[0]);

		for(int i = 1; i < words.length; i++) {
			String first = String.valueOf(words[i].charAt(0));
			String last = String.valueOf(words[i - 1].charAt(words[i - 1].length() - 1));

			if(set.contains(words[i]) || !last.equals(first)) {
				num = i % n + 1;
				round = i / n + 1;
				return new int[]{num, round};
			} else if(last.equals(first)){
				set.add(words[i]);
			}
		}
		return answer;
	}
}
