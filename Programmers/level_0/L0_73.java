package level_0;

import java.util.*;

//빈 배열에 추가, 삭제하기
public class L0_73 {
	public int[] solution(int[] arr, boolean[] flag) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			//true인 경우 arr[i]의 2배를 추가
			if(flag[i]) {
				for (int j = 0; j < arr[i] * 2; j++) {
					list.add(arr[i]);
				}
			} 
			//false인 경우 마지막 arr[i]개의 원소 제거
			else {
				for (int j = 0; j < arr[i]; j++) {
					list.remove(list.size()-1);
				}
			}
		}
		
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i); 
		}
		return answer;
	}
}
