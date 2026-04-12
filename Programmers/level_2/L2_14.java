package level_2;

//피보나치 수
public class L2_14 {
	int[] dp;

	int f(int n) {
		//f(0) = 0, f(1) = 1;
		if(n <= 1) return n;

		if(dp[n] != 0) return dp[n]; //값이 있는 경우 return

		//n번째 피보나치 수를 1234567으로 나눈 나머지를 return
		dp[n] = (f(n - 2) + f(n - 1)) % 1234567;
		return dp[n];
	}

	public int solution(int n) {
		dp = new int[n + 1];
		return f(n);
	}
}
