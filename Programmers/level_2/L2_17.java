package level_2;

//N개의 최소공배수
public class L2_17 {
	//최대공약수
	private int gcd(int n, int m) {
		while(m != 0) {
			int tmp = n % m;
			n = m;
			m = tmp;
		}
		return n;
	}

	public int solution(int[] arr) {
		int answer = arr[0];

		//최소공배수 = 두 수의 곱 / 최대공약수
		for (int i = 1; i < arr.length; i++) {
			answer = answer * arr[i] / gcd(answer, arr[i]);
		}
		return answer;
	}
}
