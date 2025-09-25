package level_0;

import java.util.ArrayList;

//콜라츠 수열 만들기
public class L0_27 {
	public int[] solution(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(n);

		while(n > 0) {
			if(n == 1) {
				break;
			}
			//짝수인 경우
			if(n % 2 == 0) {
				n = n/2;
				list.add(n);
			} 
			//홀수인 경우
			else if(n % 2 == 1) {
				n = 3 * n + 1;
				list.add(n);
			}
		}
		//배열에 값 할당
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
}
