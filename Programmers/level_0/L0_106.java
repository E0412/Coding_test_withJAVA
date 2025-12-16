package level_0;

//합성수 찾기
public class L0_106 {
	public int solution(int n) {
		int answer = 0;
		for(int i = 4; i <= n; i++) {
			for(int j = 2; j * j <= i; j++) {
				if(i % j == 0) {
					answer++;
					break; //합성수를 찾은 경우 j 루프 종료
				}
			}
		}
		return answer;
	}
}
