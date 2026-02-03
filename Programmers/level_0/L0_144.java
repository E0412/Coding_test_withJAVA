package level_0;

//숫자 찾기
public class L0_144 {
	public int solution(int num, int k) {
		String N = String.valueOf(num);
		String K = String.valueOf(k);
		return N.contains(K) ? N.indexOf(K) + 1 : -1;
	}
}
