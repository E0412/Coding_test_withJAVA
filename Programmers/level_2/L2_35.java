package level_2;

//숫자 변환하기
public class L2_35 {
	public int solution(int x, int y, int n) {
		int answer = 0;

		int m = x + n;
		
		//while문이 끝나지 않아서 오류 발생
		while(x != y) {
			if(y % m == 0) {
				if(y == m) {
					return 1;
				}
			}
			else if(y % x == 0) {
				if(y % (x * 2) == 0) {
					x *= 2;
					answer++;
				} else if(y % (x * 3) == 0) {
					x *= 3;
					answer++;
				}
			}
			else {
				return -1;
			}
		}
		return answer;
	}
}
