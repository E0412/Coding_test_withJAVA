package level_1;

//삼총사
public class L1_32 {
	public int solution(int[] number) {
		int answer = 0;
		//세 수의 합이 0이되는 경우의 수 출력
		for(int i = 0; i < number.length-2; i++) {
			for(int j = i+1; j < number.length-1; j++) {
				for(int k = j+1; k < number.length; k++) {
					if(number[i] + number[j] + number[k] == 0) {
						answer++;
					}
				}
			}
		}
		return answer;
	}
}
