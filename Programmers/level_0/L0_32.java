package level_0;

import java.util.*;

//배열 만들기 4
public class L0_32 {
	public int[] solution(int[] arr) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if(list.isEmpty()) { //빈 배열인 경우
				list.add(arr[i]);
			} 
			//원소가 있고, 마지막 원소가 arr[i]보다 작은 경우
			else if(list.get(list.size() - 1) < arr[i]) {
				list.add(arr[i]); //해당 값을 추가
			}
			//원소가 있고, 마지막 원소가 arr[i]보다 크거나 같은 경우
			else if(list.get(list.size() - 1) >= arr[i]) {
				list.remove(list.size()-1); //마지막 원소 제거
				i--; //i에 1을 더하라는 조건이 없기에 현재 값을 유지
			}
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i); 
		}

		return answer;
	}
}
