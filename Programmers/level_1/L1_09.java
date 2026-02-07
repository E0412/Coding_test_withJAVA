package level_1;

import java.util.Arrays;

//정수 내림차순으로 배치하기
public class L1_09 {
	public long solution(long n) {
		char[] ch = String.valueOf(n).toCharArray();
		Arrays.sort(ch);
		StringBuilder sb = new StringBuilder(new String(ch));
		sb.reverse();
		return Long.parseLong(sb.toString());
	}
}
