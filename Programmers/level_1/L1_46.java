package level_1;

//카드 뭉치
public class L1_46 {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		int n = 0;
		int m = 0;

		for(String s : goal) {
			//찾는 단어가 있으면 인덱스 증가, 없을시 No 출력
			if(n < cards1.length && s.equals(cards1[n])) {
				n++;
			}
			else if(m < cards2.length && s.equals(cards2[m])) {
				m++;
			}
			else {
				return "No";
			}
		}
		return "Yes";
	}
}
