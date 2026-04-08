package level_2;

//다음 큰 숫자
public class L2_13 {
	public int solution(int n) {
		int answer = 0;
		for(int i = n + 1; i <= 1000000; i++) {
			String sn = Integer.toBinaryString(n);
			String s = Integer.toBinaryString(i);
			sn = sn.replace("0", "");
			String sb = s.replace("0", "");
			if(sn.equals(sb)) {
				answer = Integer.parseInt(s, 2);
				break;
			}
		}
		return answer;
	}
}
