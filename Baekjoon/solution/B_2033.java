package solution;

import java.io.*;

//반올림
public class B_2033 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		double N = Double.parseDouble(br.readLine());
		int p = 1; //자릿수

		//정수 N이 10보다 큰 경우, 일의 자리에서 반올림 -> 자릿수를 증가시키며 반복
		for (int i = 10; i < 10000; i *= 10) {
			if(N > i) {
				int pow = (int) Math.pow(10, p); //10의 p(자릿수)제곱
				N /= pow;
				N = Math.round(N); //반올림
				N *= pow;
			} else break;
			p++; //자릿수 증가
		}
		bw.write((int)N + "");
		bw.flush();
		bw.close();
	}
}
