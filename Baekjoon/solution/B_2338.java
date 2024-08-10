package solution;

import java.io.*;
import java.math.BigInteger;

//긴자리 계산
public class B_2338 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		BigInteger n = new BigInteger(br.readLine());
		BigInteger m = new BigInteger(br.readLine());

		bw.write(n.add(m) + "\n");
		bw.write(n.subtract(m) + "\n");
		bw.write(n.multiply(m) + "\n");

		bw.flush();
		bw.close();
	}
}
