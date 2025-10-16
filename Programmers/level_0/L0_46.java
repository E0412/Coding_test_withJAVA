package level_0;

import java.util.*;

//리스트 자르기
public class L0_46 {
	public int[] solution(int n, int[] slicer, int[] num_list) {

		List<Integer> list = new ArrayList<>();

		//0번~ slicer[1]까지
		if(n == 1) {
			for (int i = 0; i <= slicer[1]; i++) {
				list.add(num_list[i]);
			}
		} 
		//num_list의 a번 인덱스부터 마지막 인덱스까지
		else if(n == 2) {
			for (int i = slicer[0]; i < num_list.length; i++) {
				list.add(num_list[i]);
			}
		} 
		//num_list의 a번 인덱스부터 b번 인덱스까지
		else if(n == 3) {
			for (int i = slicer[0]; i <= slicer[1]; i++) {
				list.add(num_list[i]);
			}
		} 
		//num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
		else if(n == 4) {
			for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
				list.add(num_list[i]);
			}
		}

		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
