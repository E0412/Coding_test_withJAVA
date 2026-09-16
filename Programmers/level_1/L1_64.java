package level_1;

import java.util.*;

//숫자 짝꿍
public class L1_64 {
	public String solution(String X, String Y) {
		StringBuilder sb = new StringBuilder();

		Queue<String> q1 = new LinkedList<String>();
		for (int i = 0; i < X.length(); i++) {
			q1.add(String.valueOf(X.charAt(i)));
		}

		Queue<String> q2 = new LinkedList<String>();
		for (int i = 0; i < Y.length(); i++) {
			q2.add(String.valueOf(Y.charAt(i)));
		}

		List<String> list = new ArrayList<String>();

		//문자열을 비교하여 동일한 문자 추출
		while(!q1.isEmpty()) {
			String s1 = q1.poll();
			int size = q2.size();

			for (int i = 0; i < size; i++) {
				String s2 = q2.poll();

				if(s2.equals(s1)) {
					list.add(s1);
					break;
				} else {
					q2.add(s2); //없으면 다시 할당
				}
			}
		}
		//역순 정렬 추가 필요

		return sb.toString();
	}
}
