package level_0;

//이진수 더하기
public class L0_148 {
	public String solution(String bin1, String bin2) {
		int b1 = Integer.parseInt(bin1, 2);
		int b2 = Integer.parseInt(bin2, 2);

		String answer = Integer.toBinaryString(b1+b2);
		return answer;
	}
}
