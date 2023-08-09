package solution;

import java.io.*;
import java.math.BigInteger;

//소음
public class B_2935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//long형을 넘어섰기 때문에 BigInteger(무한 정수)를 이용한다
		BigInteger A = new BigInteger(br.readLine());
		String in = br.readLine();
		BigInteger B = new BigInteger(br.readLine());

		if(in.equals("*")) {
			bw.write(A.multiply(B) + "");
			bw.flush();
		} else if(in.equals("+")) {
			bw.write(A.add(B) + "");
			bw.flush();
		}
		bw.close();
	}
}
