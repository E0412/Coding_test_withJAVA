package level_0;

//유한소수 판별하기
public class L0_155 {

	//최대공약수
	private int gcd(int a, int b) {
		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}

	public int solution(int a, int b) {
		int gcd = gcd(a, b);
		b /= gcd;  // 기약분수로 만들기

		//2 제거
		while (b % 2 == 0) {
			b /= 2;
		}
		//5 제거
		while (b % 5 == 0) {
			b /= 5;
		}
		//남은 값이 1이면 유한소수
		return (b == 1) ? 1 : 2;
	}
}
