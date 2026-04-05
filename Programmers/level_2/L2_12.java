package level_2;

//숫자의 표현
public class L2_12 {
	public int solution(int n) {
		int answer = 0; 
		int start = 1; 
		int end = 1; 
		int sum = 0;  

		while(start <= n) {
			//총합이 n인 경우
			if(sum == n) {
				answer++; //경우의 수 추가
				sum -= start;
				start++; 
			}
			//총합이 n보다 작은 경우
			else if(sum < n) {
				sum += end;
				end++;
			}
			//총합이 n을 초과하는 경우
			else {
				sum -= start; //값을 빼서 범위를 줄인다
				start++;
			}
		}
		return answer;
	}
}
