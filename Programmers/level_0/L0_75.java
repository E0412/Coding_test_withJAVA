package level_0;

import java.util.*;

//배열 만들기 6
public class L0_75 {
	public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			//원소가 있고 같은 경우 
			if(!list.isEmpty() && list.get(list.size()-1) == arr[i]) {
				list.remove(list.size()-1); //마지막 원소 제거
				continue;
			} 
			//원소가 있고 다른 경우
			else if(!list.isEmpty() && list.get(list.size()-1) != arr[i]) {
				list.add(arr[i]); //원소 추가
				continue;
			}
			list.add(arr[i]);
		}
		//빈 배열인 경우 -1 반환
		if(list.isEmpty()) list.add(-1);

		int[] answer = new int[list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
