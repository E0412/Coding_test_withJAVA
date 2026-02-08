package level_1;

//음양 더하기
public class L1_10 {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for(int i = 0; i < absolutes.length; i++) {
			if(signs[i] == false) {
				answer += absolutes[i] * -1;
			} 
			//false인 경우 음수
			else {
				answer += absolutes[i];    
			}
		}
		return answer;
	}
}
