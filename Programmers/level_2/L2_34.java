package level_2;

import java.util.*;

//튜플
public class L2_34 {
	public int[] solution(String s) {
		//중괄호를 공백으로 만들고 숫자만 저장
		s = s.replace("{", "").replace("}", "");
		String[] arr = s.split(",");

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(String str : arr) {
			int n = Integer.parseInt(str);
			map.put(n, map.getOrDefault(n, 0) + 1);
		}

		List<Integer> list = new ArrayList<Integer>(map.keySet());

		//내림차순 정렬
		list.sort((a, b) -> map.get(b) - map.get(a));

		return list.stream().mapToInt(i -> i).toArray();
	}
}
