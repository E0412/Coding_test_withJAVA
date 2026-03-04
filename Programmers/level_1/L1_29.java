package level_1;

//부족한 금액 계산하기
public class L1_29 {
	public long solution(int price, int money, int count) {
		long answer = money;

		for(long i = 1; i <= count; i++) {
			answer -= price * i;
		}
		//양수인 경우 0 반환
		return answer < 0 ? Math.abs(answer) : 0;
	}
}
