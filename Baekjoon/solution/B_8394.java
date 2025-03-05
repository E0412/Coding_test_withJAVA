package solution;

import java.io.*;

//악수
public class B_8394 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N + 1];

		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;

		//피보나치 수열을 활용
		for (int i = 3; i <= N; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 10; //마지막 자리만 출력
		}
		bw.write(dp[N] + "");
		bw.flush();
		bw.close();
	}
}
