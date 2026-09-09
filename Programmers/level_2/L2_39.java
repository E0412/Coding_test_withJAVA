package level_2;

import java.util.*;

//가장 큰 수
public class L2_39 {
	public String solution(int[] numbers) {
		StringBuilder sb = new StringBuilder();

		//Integer -> String 비교로 변경
		List<String> list = new ArrayList<>();

		for(int i = 0; i < numbers.length; i++) {
			list.add(String.valueOf(numbers[i]));         
		}

		Collections.sort(list, new Comparator<String>() {
			//값을 합한 뒤 정렬
			@Override
			public int compare(String a, String b) {
				String ab = a + b;
				String ba = b + a;

				return ba.compareTo(ab);
			}
		});     

		for(String s : list) {
			sb.append(s);
		}

		//numbers가 전부 0인 경우 
		if(sb.charAt(0) == '0') {
			return "0";
		}

		return sb.toString();
	}
}
