package level_0;

import java.util.*;

//A로 B 만들기
public class L0_128 {
	//직접 풀이한 버전, list를 이용하였음
	public int solution(String before, String after) {
		int answer = 0;
		List<Character> list = new ArrayList<>();
		List<Character> list2 = new ArrayList<>();

		for(int i = 0; i < before.length(); i++) {
			list.add(before.charAt(i));
			list2.add(after.charAt(i));
		}
		Collections.sort(list);
		Collections.sort(list2);

		if(list.equals(list2)) {
			answer = 1;
		}
		return answer;
	}
	//char[] 배열을 활용한 개선버전
	public int solution2(String before, String after) {
		char[] b = before.toCharArray();
		char[] a = after.toCharArray();

		Arrays.sort(b);
		Arrays.sort(a);

		return Arrays.equals(b, a) ? 1 : 0;
	}
}
