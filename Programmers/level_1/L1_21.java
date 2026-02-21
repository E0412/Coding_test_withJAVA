package level_1;

import java.util.*;

//문자열 내림차순으로 배치하기
public class L1_21 {
	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		char ch[] = s.toCharArray();
		Arrays.sort(ch);
		for(int i = s.length()-1; i >= 0; i--) {
			sb.append(ch[i]);
		}
		return sb.toString();
	}
}
