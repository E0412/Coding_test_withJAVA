package level_1;

//[PCCE 기출문제] 9번 / 지폐 접기
public class L1_62 {
	public int solution(int[] wallet, int[] bill) {
		int answer = 0;

		while(true) {
			//종료조건
			if(Math.max(bill[0], bill[1]) <= Math.max(wallet[0], wallet[1])
					&& Math.min(bill[0], bill[1]) <= Math.min(wallet[0], wallet[1])) {
				break;
			}
			//지폐의 0번 인덱스가 1번보다 크면 반으로 나눈다
			if(bill[0] > bill[1]) {
				bill[0] /= 2;
				answer++;
			} else {
				bill[1] /= 2;
				answer++;
			}
		}
		return answer;
	}
}
