package level_0;

import java.util.*;

//배열의 원소 삭제하기
public class L0_83 {
	public int[] solution(int[] arr, int[] delete_list) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			boolean chk = false;
			for (int j = 0; j < delete_list.length; j++) {
				if(arr[i] == delete_list[j]) {
					chk = true;
					break;
				}
			}
			if(!chk) {
				list.add(arr[i]);
			}
		}

		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
