package solution;

import java.io.*;
import java.util.StringTokenizer;

//TV 크기 
/*
 * 피타고라스의 정리를 활용 
 */
public class B_1297 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		int D = Integer.parseInt(st.nextToken()); //TV의 대각선 길이
		int H = Integer.parseInt(st.nextToken()); //TV의 높이 비율
		int W = Integer.parseInt(st.nextToken()); //TV의 너비 비율 

		//제곱한 값
		double D2 = Math.pow(D, 2);
		double H2 = Math.pow(H, 2);
		double W2 = Math.pow(W, 2);

		//Math.sqrt() -> 제곱근(루트)을 얻는다
		double result = Math.sqrt(D2 / (H2 + W2));

		//Math.floor() -> 버림
		bw.write((int)Math.floor(result * H) + " " + (int)Math.floor(result * W));
		bw.flush();
		bw.close();
	}
}
