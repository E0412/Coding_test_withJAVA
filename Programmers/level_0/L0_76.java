package level_0;

import java.util.*;

//무작위로 K개의 수 뽑기
public class L0_76 {
	public int[] solution(int[] arr, int k) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if(list.size() == k) break; //길이가 k와 같으면 종료
			//중복되지 않는 경우에만 추가 
			if(i > 0 && !list.contains(arr[i])) {
				list.add(arr[i]);
			} else if(i == 0){
				list.add(arr[i]);
			} else {
				continue;
			}
		}

		int tmp = k - list.size();
		if(list.size() < k) {
			//i < k - list.size()로 적은 경우 list.size()의 값이 변하게 되어 의도한 반복 횟수가 나오지 않았음
			//-> 해당 값을 따로 변수로 선언하여 사용
			for (int i = 0; i < tmp; i++) {
				list.add(-1);
			}
		} 

		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i); 
		}
		return answer;
	}
}
