package level_0;

//제곱수 판별하기
public class L0_169 {
	public int solution(int n) {
		int m = (int) Math.sqrt(n);
		return m * m == n ? 1 : 2;
	}
}
