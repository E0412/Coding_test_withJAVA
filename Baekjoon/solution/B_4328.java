package solution;

import java.io.*;
import java.math.BigInteger;

//기초 나머지 계산
public class B_4328 {		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		while(true) {
			String in = br.readLine();
			if("0".equals(in)) {
				break;
			}
			String[] arr = in.split(" ");
			int b = Integer.parseInt(arr[0]);

			sb.append(new BigInteger(arr[1], b)
					.mod(new BigInteger(arr[2], b))
					.toString(b)).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
