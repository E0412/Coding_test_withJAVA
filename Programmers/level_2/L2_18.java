package level_2;

//멀리 뛰기
public class L2_18 {
	int dp[];

	private int f(int n) {
		if(n <= 3) return n; //f(3)까지 같은 수 반환

		//메모이제이션, 계산값 재사용
		if(dp[n] != 0) return dp[n];

		dp[n] = (f(n - 1) + f(n - 2)) % 1234567;

		return dp[n];
	}

	public long solution(int n) {
		dp = new int[n + 1];
		return f(n);
	}
}
