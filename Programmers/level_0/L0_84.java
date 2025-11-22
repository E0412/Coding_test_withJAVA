package level_0;

import java.util.TreeMap;

//전국 대회 선발 고사
public class L0_84 {
	public int solution(int[] rank, boolean[] attendance) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>(); //key 값을 기준으로 정렬

		for (int i = 0; i < rank.length; i++) {
			if(attendance[i]) {
				map.put(rank[i], i);
			}
		}
		int[] arr = new int[map.size()];
		int i = 0;
		//map의 value 값 사용 
		for(int n : map.values()) {
			arr[i++] = n;
		}

		int answer = 10000 * arr[0] + 100 * arr[1] + arr[2];
		return answer;
	}
}
