package level_0;

//카운트 업
public class L0_21 {
	public int[] solution(int start_num, int end_num) {
		int index = end_num - start_num;
        
        int[] answer = new int[index+1];
		
		for (int i = 0; i <= index; i++) {
            answer[i] = start_num++;
        }
			 		
        return answer;
    }
}
