package solution;

import java.io.*;
import java.math.BigInteger;

//조합
public class B_2407 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] in = br.readLine().split(" ");

		int N = Integer.parseInt(in[0]);
		int M = Integer.parseInt(in[1]);

		//숫자가 커지기 때문에 BigInteger 사용
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ONE;

		//nCm을 구하기
		for (int i = 0; i < M; i++) {
			a = a.multiply(new BigInteger(String.valueOf(N - i)));
			b = b.multiply(new BigInteger(String.valueOf(i + 1)));
		}

		bw.write(a.divide(b) + "");
		bw.flush();
		bw.close();
	}
}
