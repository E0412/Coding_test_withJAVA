package level_1;

//나머지가 1이 되는 수 찾기
public class L1_06 {
	public int solution(int n) {
		int answer = 0;
		//나머지가 1이 되는 가장 작은 수 반환
		for(int i = 1; i < n; i++) {
			if(n % i == 1) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}
