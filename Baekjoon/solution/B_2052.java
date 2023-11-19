package solution;

import java.io.*;
import java.math.BigDecimal;

//지수연산
/*
 * 양의정수 N이 주어질 때 1/2^N을 계산하는 프로그램을 작성
 */
public class B_2052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		//부동 소수점 방식의 오차를 줄이는 BigDecimal 사용
		BigDecimal result = new BigDecimal(Math.pow(0.5, N)).setScale(N);

		//toPlainString() -> BigDecimal의 지수필드가 없는 문자열 표현을 반환
		bw.write(result.toPlainString() + "");
		bw.flush();
		bw.close();
	}
}
