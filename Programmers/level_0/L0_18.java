package level_0;

//마지막 두 원소
public class L0_18 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length + 1];

		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[i];
		}
		//마지막 원소가 그전 원소보다 크면 
		if(answer[answer.length-2] > answer[answer.length-3]) {
			//마지막 원소에서 그전 원소를 뺀 값을 추가
			answer[answer.length-1] = answer[answer.length-2] - answer[answer.length-3];
		}
		//마지막 원소가 그전 원소보다 크지 않다면 
		else if(answer[answer.length-2] <= answer[answer.length-3]) {
			//마지막 원소를 두 배한 값을 추가
			answer[answer.length-1] = answer[answer.length-2] * 2;
		}

		return answer;
	}

}
