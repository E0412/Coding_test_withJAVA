package level_2;

import java.util.*;

//귤 고르기
public class L2_15 {
	public int solution(int k, int[] tangerine) {
		int answer = 0;

		//중복되는 수 분류 필요 -> map 활용
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i : tangerine) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		List<Integer> list = new ArrayList<Integer>(map.values());
		Collections.sort(list, Collections.reverseOrder()); //내림차순 정렬(가장 많이 중복되는 순서)

		int sum = 0;
		for(int idx : list) {
			sum += idx; //선택한 귤의 총 개수
			answer++; //종류의 수
			if(sum >= k) {
				break;
			}
		}
		return answer;
	}
}
