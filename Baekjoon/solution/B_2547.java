package solution;

import java.io.*;
import java.math.BigInteger;

//사탕 선생 고창영
public class B_2547 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			br.readLine();
			//NumberFormat 에러가 발생 -> BigInteger로 타입을 바꾸어 해결
			BigInteger sum = new BigInteger("0"); //BigInteger 생성
			int N = Integer.parseInt(br.readLine()); //학생 수

			for (int j = 0; j < N; j++) {
				sum = sum.add(BigInteger.valueOf(Long.parseLong(br.readLine())));
			}
			//총합을 N으로 나눈 나머지가 0이면 YES 출력
			if(sum.mod(BigInteger.valueOf(N)).equals(BigInteger.ZERO)) {
				bw.write("YES" + "\n");
			} 
			//아닐시 NO 출력
			else {
				bw.write("NO" + "\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
