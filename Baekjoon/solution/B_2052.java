package solution;

import java.io.*;

//지수연산
/*
 * 양의정수 N이 주어질 때 1/2^N을 계산하는 프로그램을 작성
 */
public class B_2052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		double result;
		
		result = Math.pow(0.5, N);
		
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
}
