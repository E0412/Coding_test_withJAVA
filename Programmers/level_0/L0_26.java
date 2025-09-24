package level_0;

import java.math.BigInteger;

//9로 나눈 나머지
public class L0_26 {
	public int solution(String number) {
		//int와 long으로는 수용가능한 값을 초과하여 BigInteger 사용
		BigInteger num = new BigInteger(number);
		//return 값 int형으로 변환 
		int answer = num.mod(BigInteger.valueOf(9)).intValue();

		return answer;
	}
}
