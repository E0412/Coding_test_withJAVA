package level_1;

import java.util.Arrays;

//문자열 내 마음대로 정렬하기
public class L1_41 {
	public String[] solution(String[] strings, int n) {
		Arrays.sort(strings, (i, j) -> {
			char a = i.charAt(n);
			char b = j.charAt(n);

			if(a == b) {
				return i.compareTo(j);
			}
			return a - b; //사전순 정렬
		});
		return strings;
	}
}
